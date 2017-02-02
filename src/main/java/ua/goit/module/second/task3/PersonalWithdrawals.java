package ua.goit.module.second.task3;

public class PersonalWithdrawals {

    public static void main(String[] args) {
        String[] ownerNames1 = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        int[] balances1 = {1200, 250, 2000, 500, 3200};
        String ownerName1 = "Ann";
        double withdrawal1 = 100;

        String[] ownerNames2 = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        int[] balances2 = {1200, 250, 2000, 500, 3200};
        String ownerName2 = "Oww";
        double withdrawal2 = 490;

        PersonalWithdrawals transaction = new PersonalWithdrawals();
        transaction.withdraw(ownerNames1, balances1,ownerName1, withdrawal1);
        transaction.withdraw(ownerNames2, balances2,ownerName2, withdrawal2);

    }

    public void withdraw(String ownerNames[], int balances[], String ownerName, double withdrawal){
        String name = "";
        int balance = 0;
        double commission = withdrawal * 0.05;

        for (int i=0; i<ownerNames.length; i++){
            if (ownerNames[i] == ownerName) {
                name = ownerName;
                balance = balances[i];
            }
        }
        if (name != ""){
            System.out.println("ownerName - " + name + " balance = " + balance + " withdrawal = " + withdrawal);
            double newBalance = balance - withdrawal - commission;
            if (newBalance >= 0) {
                System.out.println(name + " " + withdrawal + " " + newBalance);
            }
            else {
                System.out.println(name + " NO");
            }
        }
    }
}
