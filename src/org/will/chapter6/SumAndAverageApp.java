package org.will.chapter6;

import java.util.Scanner;

public class SumAndAverageApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        int count = 0;
        double average;

        System.out.print("Enter next salary: ");

        while (in.hasNextDouble()) {
            double input = in.nextDouble();
            total += input;
            count++;
            System.out.print("Enter next salary: ");
        }

        if (count > 0) {
            average = total / count;
            System.out.printf("Total: %.2f, Average: %.2f", total, average);
        } else {
            System.out.println("No values");
        }

    }
}
