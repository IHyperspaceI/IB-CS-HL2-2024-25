package org.will.chapter9.bankaccountsagain;

public class SavingsAccount extends Account {
    @Override
    public void deductFee() {
        withdraw(5);
    }
}
