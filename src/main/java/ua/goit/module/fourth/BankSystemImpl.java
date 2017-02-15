package ua.goit.module.fourth;

public class BankSystemImpl implements BankSystem {

    public void withdrawOfUser(User user, int amount) {
        Bank bankBranch = user.getBank();
        if (amount <= bankBranch.getLimitOfWithdrawal()) {
            int commissionPercentage = bankBranch.getCommission(amount);
            double commission = amount * commissionPercentage / 100;
            double newBalance = user.getBalance() - amount - commission;
            if (newBalance > 0) {
                user.setBalance(newBalance);
            }
        }
    }

    public void fundUser(User user, int amount) {
        Bank bankBranch = user.getBank();
        if (amount <= bankBranch.getLimitOfFunding()) {
            double balance = user.getBalance();
            user.setBalance(balance + amount);
        }
    }

    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser.getBank().getCurrency().equals(toUser.getBank().getCurrency())){
            double balanceFromUser, newBalanceFromUser;
            balanceFromUser = fromUser.getBalance();
            this.withdrawOfUser(fromUser, amount);
            newBalanceFromUser = fromUser.getBalance();
            if (newBalanceFromUser < balanceFromUser){
                this.fundUser(toUser, amount);
            }
        }
    }

    public void paySalary(User user) {
        double balance, salary;
        balance = user.getBalance();
        salary = user.getSalary();
        user.setBalance(balance + salary);
    }
}
