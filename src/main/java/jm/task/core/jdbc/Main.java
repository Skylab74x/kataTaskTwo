package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Maxim", "Beldyaev", (byte) 23);
        userService.saveUser("Kazuya", "Mishima", (byte) 49);
        userService.saveUser("Dante", "SpardaSon", (byte) 44);
        userService.saveUser("Ivan", "Ivanov", (byte) 12);

        System.out.println(userService.getAllUsers());

        userService.removeUserById(4);
//        userService.cleanUsersTable();
//        userService.dropUsersTable();
    }
}
