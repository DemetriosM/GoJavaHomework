package ua.goit.module.fourth;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee,
                     long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        switch (this.getCurrency()){
            case USD:
                return 100;
            case EUR:
                return 150;
            default:
                return 0;
        }
    }

    public int getLimitOfFunding() {
        switch (this.getCurrency()){
            case USD:
                return 10000;
            case EUR:
                return 5000;
            default:
                return 0;
        }
    }

    public int getMonthlyRate() {
        switch (this.getCurrency()){
            case USD:
                return 1;
            case EUR:
                return 0;
            default:
                return 0;
        }
    }

    public int getCommission(int summ) {
        int commissionPercentage;
        switch (this.getCurrency()){
            case USD:
                commissionPercentage = (summ < 1000) ? 3 : 5;
                return commissionPercentage;
            case EUR:
                commissionPercentage = (summ < 1000) ? 10 : 11;
                return commissionPercentage;
            default:
                return 0;
        }
    }
}
