package ua.goit.module.fourth;

public class USBank extends Bank {
    private  static final int LIMIT_OF_WITHDRAWAL_USD, LIMIT_OF_WITHDRAWAL_EUR, LIMIT_OF_FUNDING_USD,
            LIMIT_OF_FANDING_EUR, MONTHLY_RATE_USD, MONTHLY_RATE_EUR, WITHDRAWAL_BORDER, COMMISSION_LESS_BORDERT_USD,
            commissionOverBordertUSD, COMMISSION_LESS_BORDER_EUR, COMMISSION_OVER_BORDER_EUR;
    static {
        LIMIT_OF_WITHDRAWAL_USD = 1000;
        LIMIT_OF_WITHDRAWAL_EUR = 1200;
        LIMIT_OF_FUNDING_USD = Integer.MAX_VALUE;
        LIMIT_OF_FANDING_EUR = 10000;
        MONTHLY_RATE_USD = 1;
        MONTHLY_RATE_EUR = 2;
        WITHDRAWAL_BORDER = 1000;
        COMMISSION_LESS_BORDERT_USD = 5;
        commissionOverBordertUSD = 7;
        COMMISSION_LESS_BORDER_EUR = 6;
        COMMISSION_OVER_BORDER_EUR = 8;
    }

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee,
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
                return LIMIT_OF_FANDING_EUR;
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
                return (summ < WITHDRAWAL_BORDER) ? COMMISSION_LESS_BORDERT_USD : commissionOverBordertUSD;
            case EUR:
                return (summ < WITHDRAWAL_BORDER) ? COMMISSION_LESS_BORDER_EUR : COMMISSION_OVER_BORDER_EUR;
            default:
                return 0;
        }
    }
}
