package org.will.chapter4;

import java.util.Scanner;

public class VolumeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the price for a six-pack: $");
        double sixpackPrice = in.nextDouble();

        System.out.print("Enter the price for a 2-liter: $");
        double twoLiterPrice = in.nextDouble();

        final int bottlesPerPack = 6;
        final double bottleVolumeOz = 16.9;
        final double twoLiterVolume = 2;
        final double bottleVolumeLiter = bottleVolumeOz * 0.0295735;

        double setPricePerLiter = sixpackPrice / (bottlesPerPack * bottleVolumeLiter);
        double bookPricePerLiter = twoLiterPrice / twoLiterVolume;

        String output = "%10s price per liter: %10.2f%n";

        System.out.printf(output, "six-pack", setPricePerLiter);
        System.out.printf(output, "2L", bookPricePerLiter);

        System.out.println("hi".indexOf('h'));
    }
}
