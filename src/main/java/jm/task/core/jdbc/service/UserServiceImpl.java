package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    public UserServiceImpl() {

    }

    public void createUsersTable() {
        UserDao userDao = new UserDaoHibernateImpl();
        userDao.createUsersTable();
    }

    public void dropUsersTable() {
        UserDao userDao = new UserDaoHibernateImpl();
        userDao.dropUsersTable();

    }

    public void saveUser(String name, String lastName, byte age) {
        UserDao userDao = new UserDaoHibernateImpl();
        userDao.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        UserDao userDao = new UserDaoHibernateImpl();
        userDao.removeUserById(id);

    }

    public List<User> getAllUsers() {
        UserDao userDao = new UserDaoHibernateImpl();
        List<User> list = new ArrayList<>();
        list = userDao.getAllUsers();
        return list;
    }

    public void cleanUsersTable() {
        UserDao userDao = new UserDaoHibernateImpl();
        userDao.cleanUsersTable();

    }
}
