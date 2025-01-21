package org.will.chapter7.primitivearrays;

import java.util.Scanner;

public class ArrayUtil {
    public static void fillArray(int[] values, Scanner scanner) {
        fillArray(values, scanner, values.length);
    }

    public static void fillArray(int[] values, Scanner scanner, int numberOfItems) {
        System.out.println("Enter whole number values:");

        for (int i = 0; i < numberOfItems; i++) {
            values[i] = scanner.nextInt();
        }
    }

    public static int[] copyArray(int[] values, int length) {
        int[] newValues = new int[length];
        for (int i = 0; i < length && i < values.length; i++) {
            newValues[i] = values[i];
        }
        return newValues;
    }

    public static int insertElement(int[] values, int position, int value, int currentSize) {
        if (currentSize < values.length) {
            currentSize++;
            for (int i = currentSize - 1; i > position; i--) {
                values[i] = values[i - 1];
            }
            values[position] = value;
            return currentSize++;
        }

        return currentSize;
    }

    public static void swap(int[] values, int i, int j) {
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }

    public static int removeElement(int[] values, int currentSize, int index) {
        if (index < currentSize) {
            for (int i = index + 1; i < currentSize; i++) {
                values[i - 1] = values[i];
            }

            return currentSize - 1;
        }
        return currentSize;
    }

    public static int find(int[] values, int value) {
        boolean found = false;
        int position = 0;

        while (position < values.length && !found) {
            if (values[position] == value) {
                found = true;
            } else {
                position++;
            }
        }

        if (found) {
            return position;
        } else {
            return -1;
        }
    }

    public static void print(int[] values) {
        print(values, values.length);
    }

    public static void print(int[] values, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(values[i] + ", ");
        }
        System.out.println();
    }
}
