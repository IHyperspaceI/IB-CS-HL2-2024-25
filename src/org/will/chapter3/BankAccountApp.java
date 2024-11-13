package org.will.chapter3;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        System.out.println("Starting balance: " + account.getBalance());
        account.deposit(100);
        System.out.println("Current balance: " + account.getBalance());
        account.withdraw(10);
        System.out.println("Current balance: " + account.getBalance());
    }
}
