package org.will.chapter4;

public class CashRegister {
    public static final double QUARTER = 0.25;
    public static final double DIME = 0.1;
    public static final double NICKEL = 0.05;
    public static final double PENNY = 0.01;

    private double purchase;
    private double payment;

    public void recordPurchase (double amount) {
        purchase += amount;
    }

    public void receivePayment(int dollars, int quarters, int dimes, int nickels, int pennies) {
        payment = dollars + quarters * QUARTER + dimes * DIME + nickels * NICKEL + pennies * PENNY;
    }

    public double getChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }

    public double getTotal() {
        return purchase;
    }
}
