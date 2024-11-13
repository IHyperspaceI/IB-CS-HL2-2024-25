package org.will.chapter4;

import java.util.Scanner;

public class StringApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        var firstName = in.nextLine();
        System.out.print("Enter your last name: ");
        var lastName = in.nextLine();

        var initials = firstName.substring(0, 1) + " " + lastName.charAt(0);
        System.out.printf("Your initials are: %s", initials);
    }
}
