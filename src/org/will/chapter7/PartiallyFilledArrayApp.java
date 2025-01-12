package org.will.chapter7;

import java.util.Scanner;

public class PartiallyFilledArrayApp {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int[] scores = new int[30];
        System.out.println("Enter scores or -1 to quit: ");
        int size = fillArray(scores);
        printResults(scores, size);
    }

    public static int fillArray(int[] scores) {
        int size = 0;
        int value = scanner.nextInt();

        while (value != -1 && size < scores.length) {
            scores[size] = value;
            size++;
            value = scanner.nextInt();
        }

        return size;
    }

    private static void printResults(int[] scores, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(scores[i]);
        }
    }
}
