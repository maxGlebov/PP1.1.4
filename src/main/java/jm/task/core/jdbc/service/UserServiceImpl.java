package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoHibernateImpl();
    public UserServiceImpl() {
    }

    public void createUsersTable() {
        userDao.createUsersTable();

    }

    public void dropUsersTable() {

        userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {

        userDao.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);

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
