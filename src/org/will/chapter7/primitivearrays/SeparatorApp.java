package org.will.chapter7.primitivearrays;

import java.util.Arrays;
import java.util.Scanner;

public class SeparatorApp {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int[] values = new int[10];
        fillArray(values);
        printResults(values);
        System.out.println(Arrays.toString(values));
    }

    public static void fillArray(int[] values) {
        System.out.println("Enter whole number values:");

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
    }

    private static void printResults(int[] values) {
        for (int i = 0; i < values.length; i++) {
            if (i != 0) {
                System.out.print(" | ");
            }
            System.out.print(values[i]);
        }
        System.out.println();
    }
}
