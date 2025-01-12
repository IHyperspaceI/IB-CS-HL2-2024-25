package org.will.chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class SearchApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[10];
        ArrayUtil.fillArray(values, scanner);
        int position = find(values, 5);

        if (position == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value is in position " + position);
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
