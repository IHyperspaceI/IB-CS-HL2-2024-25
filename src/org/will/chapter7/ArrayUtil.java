package org.will.chapter7;

import java.util.Scanner;

public class ArrayUtil {
    public static void fillArray(int[] values, Scanner scanner) {
        System.out.println("Enter whole number values:");

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
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
}
