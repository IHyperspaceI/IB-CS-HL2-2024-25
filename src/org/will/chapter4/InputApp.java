package org.will.chapter4;

import java.util.Scanner;

public class InputApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the number of books you own: ");
        int books = in.nextInt();
        System.out.printf("You have %d books!%n", books);

        System.out.print("How much is your most expensive book?: ");
        double bookCost = in.nextDouble();
        System.out.printf("Your book is $%.2f!%n", bookCost);
    }
}
