package ua.goit.module.sixth.task3;

import ua.goit.module.sixth.task2.User;

import java.util.Arrays;

public class UserUtils {

    private UserUtils(){}

    public static User[] uniqueUsers(User[] users){
        User[] unique = new User[0];
        for (int i = 0; i < users.length; i++){
            if (users[i] != null) {
                for (int j = i + 1; j < users.length; j++) {
                    if (users[i].equals(users[j])) {
                        users[j] = null;
                    }
                }
                unique = increaseUsersArray(unique, users[i]);
            }
        }
        return unique;
    }

    public static User[] usersWithConditionalBalance(User[] users, int balance){
        User[] usersConditionalBalance = new User[0];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (users[i].getBalance() == balance) {
                    usersConditionalBalance = increaseUsersArray(usersConditionalBalance, users[i]);
                }
            }
        }
        return usersConditionalBalance;
    }

    public static User[] paySalaryToUsers(User[] users){
        for(int i=0; i<users.length; i++){
            if (users[i] != null){
                users[i] = new User(users[i].getId(), users[i].getFirstName(), users[i].getFirstName(),
                        users[i].getSalary(), users[i].getSalary()+users[i].getBalance());
            }
        }
        return users;
    }

    public static long[] getUsersId(User[] users){
        long[] idArray = new long[0];
        for (int i = 0; i < users.length; i++) {
             if (users[i] !=null){
                 idArray = Arrays.copyOf(idArray, idArray.length + 1);
                 idArray[idArray.length - 1] = users[i].getId();
             }
        }
        return idArray;
    }

    public static User[] deleteEmptyUsers(User[] users){
        User[] usersWithoutEmptyElements = new User[0];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                usersWithoutEmptyElements = increaseUsersArray(usersWithoutEmptyElements, users[i]);
            }
        }
        return usersWithoutEmptyElements;
    }

    private static User[] increaseUsersArray(User[] users, User user){
        users = Arrays.copyOf(users, users.length + 1);
        users[users.length-1] = user;
        return users;
    }
}