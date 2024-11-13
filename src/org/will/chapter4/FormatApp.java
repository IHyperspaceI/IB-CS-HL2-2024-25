package org.will.chapter4;

public class FormatApp {
    public static void main(String[] args) {
        String firstName = "Bob";
        String lastName = "Finch";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));
        System.out.printf("%s %s", firstName, lastName);
    }
}
