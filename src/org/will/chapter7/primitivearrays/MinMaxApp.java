package org.will.chapter7.primitivearrays;

import java.util.Scanner;

public class MinMaxApp {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int[] array = new int[8];
        fillArray(array);
        System.out.println("MIN: " + findMin(array));
        System.out.println("MAX: " + findMax(array));
    }

    public static void fillArray(int[] values) {
        System.out.println("Enter whole number values:");

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
    }

    private static int findMin(int[] values) {
        int smallest = values[0];

        for (int value : values) {
            if (value < smallest) {
                smallest = value;
            }
        }

        return smallest;
    }

    private static int findMax(int[] values) {
        int largest = values[0];

        for (int value : values) {
            if (value > largest) {
                largest = value;
            }
        }

        return largest;
    }
}
