package org.will.chapter6;

import java.util.Scanner;

public class FindFirstApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.nextLine();

        boolean found = false;
        char ch = 'a';
        int position = 0;

        while (!found && position < input.length()) {
            char current = input.charAt(position);
            if (current == ch) {
                found = true;
            } else {
                position++;
            }
        }

        if (found) {
            System.out.printf("Position of %s is %d", ch, position);
        }
    }
}
