package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class  Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.saveUser("Oleg", "Olegov", (byte)33);


//    for jdbc version
//        int PEOPLE_COUNT = 0;
//        UserService userService = new UserServiceImpl();
//        userService.createUsersTable();
//        userService.saveUser("Oleg", "Olegov", (byte)33);
//        userService.saveUser("Olga", "Ermilova", (byte)26);
//        userService.saveUser("Maxim", "Ivanov", (byte)32);
//        userService.saveUser("Stas", "Sidorov", (byte)40);
//        System.out.println(userService.getAllUsers());
//        userService.cleanUsersTable();
//        userService.dropUsersTable();









    }
}
