package org.will.chapter4;

public class OperatorApp {
    public static void main(String[] args) {
        int score1 = 10;
        int score2 = 20;
        int score3 = 9;
        int count = 3;

        double average = (10 + 20 + 9) / (double)count;
        System.out.println(average);
        Math.round(average);
    }

    private static void operations() {
        int a = 10;
        int b = 3;

        System.out.println(a / b);
        System.out.println(a % b);
        double result = a / (double)b;
        System.out.println(result);

        int value = (int)3.125 / 3;
        System.out.println(value);
    }
}
