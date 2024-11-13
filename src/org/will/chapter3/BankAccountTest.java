package org.will.chapter3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    public void testContstructor() {
        var account = new BankAccount(100);
        double expectedBalance = 100;
        Assertions.assertEquals(expectedBalance, account.getBalance());
    }

    @Test
    public void testDeposit() {
        var account = new BankAccount(0);
        account.deposit(100);
        double expectedBalance = 100;
        Assertions.assertEquals(expectedBalance, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        var account = new BankAccount(100);
        account.withdraw(100);
        double expectedBalance = 0;
        Assertions.assertEquals(expectedBalance, account.getBalance());
    }
}
