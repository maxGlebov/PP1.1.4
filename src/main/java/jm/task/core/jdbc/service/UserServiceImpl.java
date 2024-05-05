package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
    public UserServiceImpl() {
       // UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
    }

    public void createUsersTable() {
        userDaoJDBC.createUsersTable();

    }

    public void dropUsersTable() {
        UserDao dao = new UserDaoJDBCImpl();
        dao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoJDBC.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        UserDao dao = new UserDaoJDBCImpl();
        dao.removeUserById(id);

    }

    public List<User> getAllUsers() {
        UserDao dao = new UserDaoJDBCImpl();
        List<User> list = new ArrayList<>();
        list = dao.getAllUsers();
        return list;
    }

    public void cleanUsersTable() {
        UserDao dao = new UserDaoJDBCImpl();
        dao.cleanUsersTable();

    }
}
