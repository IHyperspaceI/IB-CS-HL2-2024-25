package org.will.chapter3;

public class CounterApp {
    public static void main(String[] args) {
        var clicker = new Clicker();
        var clicker2 = new Clicker();

        for (int i = 0; i < Math.pow(2, 30); i++) {
            clicker.click();
        }

        clicker.click();
        clicker.click();
        clicker2.click();
        clicker.click();
        System.out.println(clicker.getCount());
        System.out.println(clicker2.getCount());
    }
}
