package org.will.chapter7;

public class ScoreApp {
    public static void main(String[] args) {
        printScores(1, 2, 4, 8, 16);
    }

    private static void printScores(int... values) {
        /*
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
         */

        for (int value : values) {
            System.out.println(value);
        }
    }
}
