package org.will.chapter6;

import java.util.Scanner;

public class CountingMatchesApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = in.nextLine();
        int spaces = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == ' ') {
                spaces++;
            }
        }

        System.out.println("Your string has " + spaces + " spaces.");
    }
}
