package org.will.chapter6.bank;

public class InvestmentApp {
    public static void main(String[] args) {
        final double INITIAL_BALANCE = 10000;
        final double RATE = 5;

        Investment investment = new Investment(INITIAL_BALANCE, RATE);
        investment.calculateBalance(20000.0);
        int years = investment.getYear();

        System.out.printf("Investment doubled after %d years", years);

        Investment investment2 = new Investment(INITIAL_BALANCE, RATE);
        investment2.calculateBalance(5);
        double balance = investment2.getBalance();

        System.out.printf("\nInvestment after %d years is $%.2f", 5, balance);
    }
}
