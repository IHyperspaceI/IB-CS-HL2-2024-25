package org.will.chapter5;

public class FloatingPointCompareApp {
    public static void main(String[] args) {
        double value = Math.sqrt(2);
        double result = value * value - 2;

        if (result == 0) {
            System.out.println("Sqrt(2)^2 - 2 = 0");
        } else {
            System.out.println("Sqrt(2)^2 - 2 ≠ 0 but " + result);
        }

        final double EPSILON = 1E-14;

        if (Math.abs(result - 0) <= EPSILON) {
            System.out.println("Sqrt(2)^2 - 2 is approximately 0");
        } else {
            System.out.println("Sqrt(2)^2 - 2 ≠ 0 but " + result);
        }
    }
}
