package org.will.chapter10;

public class Data {
    public static double average(Measurable[] measures) {
        double sum = 0;
        for (Measurable measurable : measures) {
            sum += measurable.getMeasure();
        }

        if (measures.length > 0) {
            return sum / measures.length;
        }

        return 0;
    }

    public static double average(Object[] objects, Measure measure) {
        double sum = 0;

        for (var obj : objects) {
            sum += measure.measure(obj);
        }

        if (objects.length > 0) {
            return sum / objects.length;
        }

        return 0;
    }
}
