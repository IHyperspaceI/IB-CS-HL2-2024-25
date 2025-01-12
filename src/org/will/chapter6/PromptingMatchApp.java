package org.will.chapter6;

import java.util.Scanner;

public class PromptingMatchApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean valid = false;
        int input = 0;

        if (in.hasNextInt()) {
            while (!valid) {
                System.out.print("Please enter a positive number < 100: ");
                input = in.nextInt();
                if (input < 100 && input > 0) {
                    valid = true;
                } else {
                    System.out.println("Invalid input");
                }
            }
        } else {
            in.nextLine();
            System.out.println("Invalid input, must be a whole number");
        }

        System.out.println("You entered " + input);
    }
}
