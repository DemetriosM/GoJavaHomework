package ua.goit.module.fourth;

public class Main {
    public static void main(String[] args) {
        Bank usBankUSD, euBankUSD, chinaBankUSD, usBankEUR, euBankEUR, chinaBankEUR;
        usBankUSD = new USBank(111, "USA", Currency.USD, 100, 3000, 91, 1000000000);
        usBankEUR = new USBank(111, "USA", Currency.EUR, 100, 3000, 91, 1000000000);
        euBankUSD = new EUBank(222, "France", Currency.USD, 85, 2000, 90, 800000000);
        euBankEUR = new EUBank(222, "France", Currency.EUR, 85, 2000, 90, 800000000);
        chinaBankUSD = new ChinaBank(333, "China", Currency.USD, 200, 700, 85, 2000000000);
        chinaBankEUR = new ChinaBank(333, "China", Currency.EUR, 200, 700, 85, 2000000000);

        User usBankUser1, usBankUser2, euBankUser1, euBankUser2, chinaBankUser1, chinaBankUser2;
        usBankUser1 = new User(11, "Natalia", 1200, 6, "Ford", 2000, usBankUSD);
        usBankUser2 = new User(12, "Oleg", 200, 3, "BMW", 1200, usBankEUR);
        euBankUser1 = new User(21, "Irina", 2500, 10, "Ford", 2500, euBankUSD);
        euBankUser2 = new User(22, "Alexander", 300, 2, "BMW", 1200, euBankEUR);
        chinaBankUser1 = new User(31, "Jackie", 2500, 12, "GEELY", 500, chinaBankUSD);
        chinaBankUser2 = new User(32, "Chan", 1200, 7, "GEELY", 500, chinaBankEUR);

        BankSystem banking = new BankSystemImpl();
        System.out.printf(usBankUser1.toString());
        banking.withdrawOfUser(usBankUser1, 150);
        System.out.printf("Balance after withdrawing 150\n%s\n", usBankUser1.toString());
        System.out.printf(chinaBankUser2.toString());
        banking.withdrawOfUser(chinaBankUser2, 150);
        System.out.printf("Balance after withdrawing 150\n%s\n", chinaBankUser2.toString());
        System.out.printf(usBankUser2.toString());
        banking.fundUser(usBankUser2, 450);
        System.out.printf("Balance after funding 450\n%s\n", usBankUser2.toString());
        System.out.printf(euBankUser1.toString());
        System.out.printf(chinaBankUser1.toString());
        banking.transferMoney(euBankUser1, chinaBankUser1, 500);
        System.out.printf("Balances after transfer 500\n%s%s\n", euBankUser1.toString(), chinaBankUser1.toString());
        System.out.printf(euBankUser2.toString());
        banking.paySalary(euBankUser2);
        System.out.printf("Balance after receiving the salary\n%s\n", euBankUser2.toString());
    }
}
