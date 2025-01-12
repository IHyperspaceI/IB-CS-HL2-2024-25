package org.will.chapter6;

public class PowersApp {
    public static void main(String[] args) {
        final int MAX_ROWS = 10;
        final int MAX_COLUMNS = 10;

        // print table header
        for (int i = 1; i < MAX_COLUMNS; i++) {
            System.out.printf("%15d", i);
        }
        System.out.println();
        for (int i = 1; i < MAX_COLUMNS; i++) {
            System.out.printf("%15s", "x ");
        }
        System.out.println();

        for (int i = 1; i < MAX_ROWS; i++) {
            for (int j = 1; j < MAX_COLUMNS; j++) {
                System.out.printf("%15.2f", Math.pow(i, j));
            }
            System.out.println();
        }
    }
}
