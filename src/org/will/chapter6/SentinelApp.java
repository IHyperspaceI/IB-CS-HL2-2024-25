package org.will.chapter6;

import java.util.Scanner;

public class SentinelApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int value;

        System.out.print("Enter a grade value or -1 to quit: ");

        value = in.nextInt();

        while (value != -1) {
            sum += value;
            count++;
            System.out.print("Enter a grade value or -1 to quit: ");
            value = in.nextInt();
        }

        if (sum != 0) {
            double average = (double) sum / count;
            System.out.printf("Average score: %.2f", average);
        } else {
            System.out.println("No values entered");
        }
    }
}
