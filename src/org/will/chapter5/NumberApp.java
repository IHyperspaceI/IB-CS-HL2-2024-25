package org.will.chapter5;

import java.util.Scanner;

public class NumberApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Give me a single number between 0 and 9: ");
        int digit = in.nextInt();

        String digitName = switch (digit) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "none";
        };

        System.out.println("Number: " + digitName);
    }
}
