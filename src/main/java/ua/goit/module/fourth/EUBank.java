package ua.goit.module.fourth;

public class EUBank extends Bank {
    private  static final int LIMIT_OF_WITHDRAWAL_USD, LIMIT_OF_WITHDRAWAL_EUR, LIMIT_OF_FUNDING_USD,
            LIMIT_OF_FUNDING_EUR, MONTHLY_RATE_USD, MONTHLY_RATE_EUR, WITHDRAWAL_BORDER, COMMISSION_LESS_BORDER_USD,
            COMMISSION_OVER_BORDER_USD, COMMISSION_LESS_BORDER_EUR, COMMISSION_OVER_BORDER_EUR;
    static {
        LIMIT_OF_WITHDRAWAL_USD = 2000;
        LIMIT_OF_WITHDRAWAL_EUR = 2200;
        LIMIT_OF_FUNDING_USD = 10000;
        LIMIT_OF_FUNDING_EUR = 20000;
        MONTHLY_RATE_USD = 0;
        MONTHLY_RATE_EUR = 1;
        WITHDRAWAL_BORDER = 1000;
        COMMISSION_LESS_BORDER_USD = 5;
        COMMISSION_OVER_BORDER_USD = 7;
        COMMISSION_LESS_BORDER_EUR = 2;
        COMMISSION_OVER_BORDER_EUR = 4;
    }

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee,
                  long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }
    @Override
    public int getLimitOfWithdrawal() {
        switch (this.getCurrency()){
            case USD:
                return LIMIT_OF_WITHDRAWAL_USD;
            case EUR:
                return LIMIT_OF_WITHDRAWAL_EUR;
            default:
                return 0;
        }
    }
    @Override
    public int getLimitOfFunding() {
        switch (this.getCurrency()){
            case USD:
                return LIMIT_OF_FUNDING_USD;
            case EUR:
                return LIMIT_OF_FUNDING_EUR;
            default:
                return 0;
        }
    }
    @Override
    public int getMonthlyRate() {
        switch (this.getCurrency()){
            case USD:
                return MONTHLY_RATE_USD;
            case EUR:
                return MONTHLY_RATE_EUR;
            default:
                return 0;
        }
    }
    @Override
    public int getCommission(int summ) {
        switch (this.getCurrency()){
            case USD:
                return (summ < WITHDRAWAL_BORDER) ? COMMISSION_LESS_BORDER_USD : COMMISSION_OVER_BORDER_USD;
            case EUR:
                return (summ < WITHDRAWAL_BORDER) ? COMMISSION_LESS_BORDER_EUR : COMMISSION_OVER_BORDER_EUR;
            default:
                return 0;
        }
    }
}
