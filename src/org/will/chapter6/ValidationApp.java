package org.will.chapter6;

import java.util.Scanner;

public class ValidationApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value;

        do {
            System.out.println("Enter a value <= 100");
            value = in.nextInt();
        } while (value > 100 || value < 0);

        System.out.println("You entered " + value);
    }
}
