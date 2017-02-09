package ua.goit.module.second.task4;

public class AccountRefill {
    public static void main(String[] args) {
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        int[] balances = {1205, 250, 2010, 540, 3210};
        String ownerName = "Oww";
        double withdrawal = 135;

        fund(ownerNames, balances, ownerName, withdrawal);
    }

    public static void fund(String ownerNames[], int balances[], String ownerName, double withdrawal){
        for (int i=0; i<ownerNames.length; i++){
            if (ownerNames[i].equals(ownerName)) {
                System.out.printf("%s new balance %.2f \n", ownerName, (withdrawal+balances[i]));
            }
        }
    }
}
