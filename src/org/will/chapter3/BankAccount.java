package org.will.chapter3;

/**
 * An object used for tracking amounts of money
 */
public class BankAccount {
    private double balance;

    /**
     * Creates a new Bank Account with the starting balance
     * @param balance how much money is initially in the account
     */
    public BankAccount(double balance) {
        this.balance = balance;
    }

    /**
     * Gets the current balance of the account
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Removes the specified amount of money from the account
     * @param amount how much money to remove
     */
    public void withdraw(double amount) {
        balance -= amount;
    }

    /**
     * Adds the specified amount of money to the account
     * @param amount how much money to add
     */
    public void deposit(double amount) {
        balance += amount;
    }
}