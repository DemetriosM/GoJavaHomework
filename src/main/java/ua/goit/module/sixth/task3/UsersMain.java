package ua.goit.module.sixth.task3;

import ua.goit.module.sixth.task2.User;
import java.util.Arrays;

public class UsersMain {
    public static void main(String[] args) {
        User[] users = new User[]{
                new User(1001, "Vasya", "Petrov", 300, 400),
                new User(1002, "Petr", "Gorohov", 500, 200),
                new User(1003, "Olga", "Kovalenko", 450, 700),
                null,
                new User(1005, "Irina", "Doroshenko", 800, 2000),
                new User(1005, "Irina", "Doroshenko", 800, 2000),
                new User (1006, "Petr", "Doroshenko", 600, 700),
                new User (1007, "Denis", "Pavlov", 100, 700),
                null
        };

        System.out.println(Arrays.toString(users));
        System.out.printf("\n\nunique users:\n%s", Arrays.toString(UserUtils.uniqueUsers(users)));
        System.out.printf("\n\nusers with conditional balance:\n%s", Arrays.toString(UserUtils.usersWithConditionalBalance(users, 700)));
        UserUtils.paySalaryToUsers(users);
        System.out.printf("\n\nusers after payment salary:\n%s", Arrays.toString(users));
        System.out.printf("\n\nusers id %s\n", Arrays.toString(UserUtils.getUsersId(users)));
        System.out.printf("\n\narray after deleting empty elements %s\n", Arrays.toString(UserUtils.deleteEmptyUsers(users)));
    }
}
