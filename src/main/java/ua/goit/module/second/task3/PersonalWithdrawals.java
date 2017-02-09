package ua.goit.module.second.task3;

public class PersonalWithdrawals {

    public static void main(String[] args) {
        String[] ownerNames1 = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        int[] balances1 = {1200, 250, 2000, 500, 3200};
        String ownerName1 = "Ann";
        double withdrawal1 = 100;

        String[] ownerNames2 = {"Ann", "Marry", "Kate", "Oww", "Jack"};
        int[] balances2 = {105, 270, 2030, 510, 2900};
        String ownerName2 = "Oww";
        double withdrawal2 = 490;

        withdraw(ownerNames1, balances1,ownerName1, withdrawal1);
        withdraw(ownerNames2, balances2,ownerName2, withdrawal2);
    }

    public static void withdraw(String ownerNames[], int balances[], String ownerName, double withdrawal){
        float rate = 0.05f;
        double commission = withdrawal * rate;
        for (int i=0; i<ownerNames.length; i++){
            if (ownerNames[i].equals(ownerName)) {
                System.out.printf("ownerName - %s balance = %d withdrawal = %.2f \n", ownerName, balances[i], withdrawal);
                double newBalance = balances[i] - withdrawal - commission;
                if (newBalance >= 0) {
                    System.out.printf("%s %.2f newBalance %.2f \n\n", ownerName, withdrawal, newBalance);
                }
                else {
                    System.out.printf("%s NO \n\n", ownerName);
                }
            }
        }
    }
}
