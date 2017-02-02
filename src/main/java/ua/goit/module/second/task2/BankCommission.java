package ua.goit.module.second.task2;

public class BankCommission {
    public static void main(String[] args) {

        BankCommission transaction = new BankCommission();
        transaction.withdraw(100, 10);
        transaction.withdraw(100, 99);

    }

    public void withdraw(double balance, double withdrawal){
        System.out.println("balance = " + balance + " withdrawal = " + withdrawal);
        double commission = withdrawal * 0.05;
        double newBalance = balance - withdrawal - commission;

        if (newBalance >= 0) {
            System.out.println("OK " + commission + " " + newBalance);
        }
        else {
            System.out.println("NO");
        }
    }
}
