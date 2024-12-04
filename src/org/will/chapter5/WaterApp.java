package org.will.chapter5;

import java.util.Scanner;

public class WaterApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter water temp (°C): ");
        int temp = in.nextInt();

        // AND
        if (temp > 0 && temp < 100) {
            System.out.println("Liquid");
        }

        // OR
        if (temp <= 0 || temp >= 100) {
            System.out.println("Not liquid");
        }
    }
}
