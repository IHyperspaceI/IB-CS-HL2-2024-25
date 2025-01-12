package org.will.chapter7;

import java.util.Scanner;

public class MethodApp {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        ArrayUtil.fillArray(numbers, scanner);
        printResults(numbers);
    }

    private static void fillArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
    }

    private static void printResults(int[] values) {
        for (int value : values) {
            System.out.println(value);
        }
    }
}
