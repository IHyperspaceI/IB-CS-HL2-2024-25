package org.will.chapter5.elevator;

import java.util.Scanner;

public class ElevatorApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter floor: ");

        if (!in.hasNextInt()) {
            System.out.println("Invalid input. Whole number expected.");
            return;
        }

        int floor = in.nextInt();

        System.out.println("Actual floor: " + (floor > 13 ? floor - 1 : floor));
    }

    private static void ifElse() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter floor: ");
        int floor = in.nextInt();

        int actualFloor = floor;

        //Adjust floor
        if (actualFloor > 13) {
            actualFloor--;
        } else if (actualFloor == 13) {
            System.out.println("Floor 13 does not exist");
            return;
        }

        System.out.printf("Floor: %d", actualFloor);
    }
}
