package org.will.chapter7.primitivearrays;

import java.util.Scanner;

public class SumAndAverageApp {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int[] values = new int[10];
        fillArray(values);
        int sum = sum(values);
        double average = 0;

        if (values.length > 0) {
            average = sum / (double) values.length;
        }

        System.out.printf("The sum is %d and the average is %f", sum, average);
    }

    private static int sum(int[] values) {
        int total = 0;

        for (int value : values) {
            total += value;
        }

        return total;
    }

    public static void fillArray(int[] values) {
        System.out.println("Enter whole number values:");

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
    }
}
