package ua.goit.module.second.task4;

public class AccountRefill {
    public static void main(String[] args) {
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        int[] balances = {1200, 250, 2000, 500, 3200};
        String ownerName = "Oww";
        double withdrawal = 100;

        AccountRefill transaction = new AccountRefill();
        transaction.fund(ownerNames, balances, ownerName, withdrawal);
    }

    public void fund(String ownerNames[], int balances[], String ownerName, double withdrawal){
        String name = "";
        int balance = 0;

        for (int i=0; i<ownerNames.length; i++){
            if (ownerNames[i] == ownerName) {
                name = ownerName;
                balance = balances[i];
            }
        }
        if (name != ""){
            System.out.println(name + " " + (withdrawal+balance) );
        }
    }
}
