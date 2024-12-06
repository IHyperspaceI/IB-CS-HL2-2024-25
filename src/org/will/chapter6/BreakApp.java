package org.will.chapter6;

import java.util.Scanner;

public class BreakApp {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a number or Q to quit: ");
            String input = in.next();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            int value = Integer.parseInt(input);
            System.out.println("Your value: " + value);
        }
    }
}
