package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoHibernateImpl();

//        userDao.createUsersTable();
//        userDao.saveUser("Maxim", "Beldyaev", (byte) 23);
//        userDao.saveUser("Kazuya", "Mishima", (byte) 49);
//        userDao.saveUser("Dante", "SpardaSon", (byte) 44);
//        userDao.saveUser("Ivan", "Ivanov", (byte) 12);

        System.out.println(userDao.getAllUsers());

        //userDao.removeUserById(4);
        //userDao.dropUsersTable();
        userDao.cleanUsersTable();
    }
}
