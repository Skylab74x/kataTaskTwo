package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userDao = new UserServiceImpl();

        userDao.createUsersTable();
        userDao.saveUser("Maxim", "Beldyaev", (byte) 23);
        userDao.saveUser("Kazuya", "Mishima", (byte) 49);
        userDao.saveUser("Dante", "SpardaSon", (byte) 44);
        userDao.saveUser("Ivan", "Ivanov", (byte) 12);

        System.out.println(userDao.getAllUsers());

        userDao.removeUserById(4);
//        userDao.cleanUsersTable();
//        userDao.dropUsersTable();
    }
}
