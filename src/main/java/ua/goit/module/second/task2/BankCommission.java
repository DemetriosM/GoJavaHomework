package ua.goit.module.second.task2;

public class BankCommission {
    public static void main(String[] args) {
        withdraw(100, 10);
        withdraw(130, 125);
    }

    public static void withdraw(double balance, double withdrawal){
        System.out.printf("balance = %.2f, withdrawal = %.2f \n", balance, withdrawal);
        float rate = 0.05f;
        double commission = withdrawal * rate;
        double newBalance = balance - withdrawal - commission;
        if (newBalance >= 0) {
            System.out.printf("OK commission = %.2f newBalance = %.2f \n\n", commission, newBalance);
        }
        else {
            System.out.println("NO");
        }
    }
}
