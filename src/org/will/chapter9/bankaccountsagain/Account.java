package org.will.chapter9.bankaccountsagain;

import org.will.chapter9.quizzes.Question;

import java.util.Objects;

public abstract class Account {
    protected double balance;
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void deductFee();

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        String string = "[Account: "
                + "balance: " + balance
                + ", name: " + name + "]";
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Question)) return false;

        Account other = (Account) o;
        return name.equals(other.name) && balance == other.balance;
    }
}
