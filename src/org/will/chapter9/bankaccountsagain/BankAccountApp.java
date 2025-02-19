package org.will.chapter9.bankaccountsagain;

public class BankAccountApp {
    public static void main(String[] args) {
        Account account = new SavingsAccount();
        String name = "Savings";
        account.setName(name);
        account.withdraw(-5);
        System.out.println(account);
    }
}
