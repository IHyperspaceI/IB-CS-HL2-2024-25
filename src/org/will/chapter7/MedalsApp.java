package org.will.chapter7;

public class MedalsApp {
    public static void main(String[] args) {
        final int COUNTRIES = 8;
        final int MEDALS = 3;

        String[] countries = {
                "Canada", "Italy", "Germany", "Japan", "Russia", "Serbia", "China", "United States"
        };

        int[][] counts = {
                {5, 2, 7},
                {63, 0, 0},
                {1, 2, 3},
                {0, 0, 0},
                {5, 5, 5},
                {5, 2, 7},
                {3, 2, 1},
                {4, 4, 4}
        };

        System.out.printf("\t\tCountry\t%8s%8s%8s%8s\n", "Gold", "Silver", "Bronze", "Total");
        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%15s", countries[i]);

            int total = 0;

            for (int j = 0; j < counts[i].length; j++) {
                System.out.printf("%8d", counts[i][j]);
                total += counts[i][j];
            }
            System.out.printf("%8d\n", total);
        }
    }
}
