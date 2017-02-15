package ua.goit.module.fourth;

public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee,
                  long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        switch (this.getCurrency()){
            case USD:
                return 1000;
            case EUR:
                return 1200;
            default:
                return 0;
        }
    }

    public int getLimitOfFunding() {
        switch (this.getCurrency()){
            case USD:
                return Integer.MAX_VALUE;
            case EUR:
                return 10000;
            default:
                return 0;
        }
    }

    public int getMonthlyRate() {
        switch (this.getCurrency()){
            case USD:
                return 1;
            case EUR:
                return 2;
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
                commissionPercentage = (summ < 1000) ? 6 : 8;
                return commissionPercentage;
            default:
                return 0;
        }
    }
}
