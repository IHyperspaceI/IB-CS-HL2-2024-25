package org.will.chapter6;

import java.util.Scanner;

public class MinMaxApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double smallest = findMin(in);
        double largest = findMax(in);
        System.out.printf("\nThe smallest number is %f and the largest number is %f", smallest, largest);
    }
    private static double findMin(Scanner in) {
        System.out.print("Enter in numbers or Q to quit: ");
        double smallest;

        if (in.hasNextDouble()) {
            smallest = in.nextDouble();
        } else {
            return 0;
        }

        while (in.hasNextDouble()) {
            double value = in.nextDouble();

            if (value < smallest) {
                smallest = value;
            }
        }

        return smallest;
    }

    private static double findMax(Scanner in) {
        System.out.print("Enter in numbers or Q to quit: ");
        double largest;

        if (in.hasNextDouble()) {
            largest = in.nextDouble();
        } else {
            return 0;
        }

        while (in.hasNextDouble()) {
            double value = in.nextDouble();

            if (value > largest) {
                largest = value;
            }
        }

        return largest;
    }
}
