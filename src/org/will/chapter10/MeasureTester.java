package org.will.chapter10;

import java.awt.*;

public class MeasureTester {
    public static void main(String[] args) {
        Measure areaMeasure = new AreaMeasurer();
        Rectangle[] tangles = new Rectangle[] {
                new Rectangle(5, 10),
                new Rectangle(25, 3),
                new Rectangle(10, 9),
                new Rectangle(80, 12),
                new Rectangle(16, 16)
        };

        double averageArea = Data.average(tangles, areaMeasure);
        System.out.printf("Average area: %.2f", averageArea);
    }
}
