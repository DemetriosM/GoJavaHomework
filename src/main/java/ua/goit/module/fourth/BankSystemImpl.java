package ua.goit.module.fourth;

public class BankSystemImpl implements BankSystem {

    public void withdrawOfUser(User user, int amount) {
        if (amount <= user.getBank().getLimitOfWithdrawal()) {
            if ((user.getBalance() - amount - amount * user.getBank().getCommission(amount) / 100) > 0) {
                user.setBalance(user.getBalance() - amount - amount * user.getBank().getCommission(amount) / 100);
            }
        }
    }

    public void fundUser(User user, int amount) {
        if (amount <= user.getBank().getLimitOfFunding()) {
            user.setBalance(user.getBalance() + amount);
        }
    }

    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser.getBank().getCurrency().equals(toUser.getBank().getCurrency())){
            double balanceFromUserBeforeWithdrawing;
            balanceFromUserBeforeWithdrawing = fromUser.getBalance();
            this.withdrawOfUser(fromUser, amount);
            if (fromUser.getBalance() < balanceFromUserBeforeWithdrawing){
                this.fundUser(toUser, amount);
            }
        }
    }

    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
    }
}
