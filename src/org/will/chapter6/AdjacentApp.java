package org.will.chapter6;

import java.util.Scanner;

public class AdjacentApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0;
        System.out.print("Enter a number or Q to quit: ");

        if (in.hasNextInt()) {
            input = in.nextInt();
        } else {
            System.out.println("No value entered");
            return;
        }

        while (in.hasNextInt()) {
            int previous = input;
            input = in.nextInt();
            if (previous == input) {
                System.out.println("Duplicate input");
            }
        }
    }
}
