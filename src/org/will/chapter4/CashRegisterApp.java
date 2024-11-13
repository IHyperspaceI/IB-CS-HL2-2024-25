package org.will.chapter4;

public class CashRegisterApp {
    public static void main(String[] args) {
        var register = new CashRegister();

        register.recordPurchase(2.5);
        register.recordPurchase(2.5);
        register.recordPurchase(2.5);
        register.recordPurchase(2.5);
        register.recordPurchase(2.5);
        register.recordPurchase(2.5);
        register.recordPurchase(1.29);

        System.out.printf("Total: $%.2f\n", register.getTotal());
        register.receivePayment(100, 0, 0, 0, 0);
        System.out.printf("Change: $%.2f", register.getChange());
    }
}
