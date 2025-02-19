package org.will.chapter10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MeasureApp {
    public static void main(String[] args) {
        Measurable[] accounts = new Measurable[8];

        accounts[0] = new BankAccount(75, "Savings");
        accounts[1] = new BankAccount(-50);
        accounts[2] = new BankAccount(100);
        accounts[3] = new Computer(80);
        accounts[4] = new BankAccount(2);
        accounts[5] = new BankAccount(10);
        accounts[6] = new BankAccount(-5);
        accounts[7] = new BankAccount(500);

        double averageBalance = Measurable.average(accounts);
        System.out.printf("Average Balance: $%.2f\n", averageBalance);
        if (accounts[0] instanceof BankAccount) {
            System.out.printf("First account name: %s\n", ((BankAccount) accounts[0]).getName());
        }


        System.out.println("Unsorted:");
        for (var account : accounts) {
            System.out.println(account.getMeasure());
        }
        Arrays.sort(accounts);
        System.out.println("Sorted:");
        for (var account : accounts) {
            System.out.println(account.getMeasure());
        }

        Measurable[] computers = new Measurable[3];
        computers[0] = new Computer(8);
        computers[1] = new Computer(16);
        computers[2] = new Computer(64);

        double averageMemory = Measurable.average(computers);
        System.out.printf("Average Memory: %.2f\n", averageMemory);
    }
}
