package ua.goit.module.fourth;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee,
                  long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        switch (this.getCurrency()){
            case USD:
                return 2000;
            case EUR:
                return 2200;
            default:
                return 0;
        }
    }

    public int getLimitOfFunding() {
        switch (this.getCurrency()){
            case USD:
                return 10000;
            case EUR:
                return 20000;
            default:
                return 0;
        }
    }

    public int getMonthlyRate() {
        switch (this.getCurrency()){
            case USD:
                return 0;
            case EUR:
                return 1;
            default:
                return 0;
        }
    }

    public int getCommission(int summ) {
        int commissionPercentage;
        switch (this.getCurrency()){
            case USD:
                commissionPercentage = (summ < 1000) ? 5 : 7;
                return commissionPercentage;
            case EUR:
                commissionPercentage = (summ < 1000) ? 2 : 4;
                return commissionPercentage;
            default:
                return 0;
        }
    }
}
