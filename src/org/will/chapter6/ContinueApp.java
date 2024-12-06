package org.will.chapter6;

import java.util.Scanner;

public class ContinueApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        System.out.print("Enter a number or Q to quit: ");
        while (!done) {
            String input = in.next();
            if (input.equalsIgnoreCase("Q")) {
                done = true;
                continue;
            }
            int value = Integer.parseInt(input);
            System.out.println("You entered: " + value);
        }
    }
}
