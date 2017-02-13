package ua.goit.module.third.task4;

public class User {
    private String name;
    private float balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }
    public float getBalance() {
        return balance;
    }
    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }
    public String getCompanyName() {
        return companyName;
    }
    public int getSalary() {
        return salary;
    }
    public String getCurrency() {
        return currency;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void paySalary(){
        this.balance += this.salary;
    }

    public void withdraw(int summ){
        float commission, expectedBalance;
        commission = (summ < 1000) ? 0.05f : 0.1f;
        expectedBalance = this.balance - summ - summ*commission;
        if (expectedBalance >= 0){
            this.balance = expectedBalance;
        }
    }

    public int companyNameLenght(){
        return this.companyName.length();
    }

    public void monthIncreaser(int addMonth){
        this.monthsOfEmployment += addMonth;
    }

    public String displayTheUser(){
        return String.format("Name: %s; Balance: %.2f; Months of employment: %d; Company name: %s; Salary: %d; Currency: %s",
                this.name, this.balance, this.monthsOfEmployment, this.companyName, this.salary, this.currency);
    }
}
