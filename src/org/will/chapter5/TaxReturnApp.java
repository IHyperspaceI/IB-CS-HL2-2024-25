package org.will.chapter5;

import java.util.Scanner;

import static org.will.chapter5.FilingStatus.MARRIED;
import static org.will.chapter5.FilingStatus.SINGLE;

public class TaxReturnApp {
    /*
    public static final int SINGLE = 1;
    public static final int MARRIED = 2;
    */

    public static final double RATE1 = 0.1;
    public static final double RATE2 = 0.25;

    public static final double RATE1_SINGLE_LIMIT = 32_000;
    public static final double RATE1_MARRIED_LIMIT = 64_000;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your income: ");
        double income = in.nextDouble();

        System.out.print("Are you married? (Y/N): ");
        String input = in.next();
        FilingStatus maritalStatus = input.equalsIgnoreCase("y") ? MARRIED : SINGLE;

        double taxAmount = getTax(income, maritalStatus);

        System.out.println("Tax: " + taxAmount);
    }

    private static double getTax(double income, FilingStatus maritalStatus) {
        double tax1 = 0;
        double tax2 = 0;

        if (maritalStatus == SINGLE) {
            if (income <= RATE1_SINGLE_LIMIT) {
                tax1 = RATE1 * income;
            } else {
                tax1 = RATE1 * RATE1_SINGLE_LIMIT;
                tax2 = RATE2 * (income - RATE1_SINGLE_LIMIT);
            }
        } else {
            if (income <= RATE1_MARRIED_LIMIT) {
                tax1 = RATE1 * income;
            } else {
                tax1 = RATE1 * RATE1_MARRIED_LIMIT;
                tax2 = RATE2 * (income - RATE1_MARRIED_LIMIT);
            }
        }

        return tax1 + tax2;
    }
}
