package org.will.chapter10;

public class BankAccount implements Measurable, Comparable<BankAccount> {
    private double balance;
    private String name;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public BankAccount(double balance, String name) {
        this(balance);
        this.name = name;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public double getMeasure() {
        return balance;
    }

    @Override
    public int compareTo(BankAccount o) {
        if (balance < o.balance) {
            return -1;
        } else if (balance > o.balance) {
            return 1;
        } else {
            return 0;
        }
    }
}
