package org.will.chapter6.bank;

public class Investment {
    private double balance;
    private double interestRate;
    private int year;

    public Investment(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    public int getYear() {
        return year;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void calculateBalance(double targetBalance) {
        while (balance < targetBalance) {
            year++;
            double interest = balance * interestRate / 100;
            balance += interest;
        }
    }

    public void calculateBalance(int years) {
        for (int i = 0; i <= years; i++) {
            double interest = balance * interestRate / 100;
            balance += interest;
        }
    }
}
