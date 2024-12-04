package org.will.chapter5;

import java.util.Scanner;

public class EarthquakeApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Richter value: ");
        double richter = in.nextDouble();
        String description;

        if (richter >= 8) {
            description = "Most structures fall";
        } else if (richter >= 7){
            description = "Many buildings are destroyed";
        }
    }
}
