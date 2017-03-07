package ua.goit.module.sixth.task3;

import ua.goit.module.sixth.task2.User;

import java.util.Arrays;

public class UserUtils {

    public User[] uniqueUsers(User[] users){
        for (int i = 0; i < users.length; i++){
            if (users[i] != null) {
                for (int j = i + 1; j < users.length; j++) {
                    if (users[i].equals(users[j])) {
                        users[j] = null;
                    }
                }
            }
        }
        return users;
    }

    public User[] usersWithConditionalBalance(User[] users, int balance){
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

    public final User[] paySalaryToUsers(User[] users){
        for(User user : users){
            if (user != null){
                user.setBalance(user.getBalance() + user.getSalary());
            }
        }
        return users;
    }

    public final long[] getUsersId(User[] users){
        long[] idArray = new long[0];
        for (int i = 0; i < users.length; i++) {
             if (users[i] !=null){
                 idArray = Arrays.copyOf(idArray, idArray.length + 1);
                 idArray[idArray.length - 1] = users[i].getId();
             }
        }
        return idArray;
    }

    public User[] deleteEmptyUsers(User[] users){
        User[] usersWithoutEmptyElements = new User[0];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                usersWithoutEmptyElements = increaseUsersArray(usersWithoutEmptyElements, users[i]);
            }
        }
        return usersWithoutEmptyElements;
    }

    private User[] increaseUsersArray(User[] users, User user){
        users = Arrays.copyOf(users, users.length + 1);
        users[users.length-1] = user;
        return users;
    }
}