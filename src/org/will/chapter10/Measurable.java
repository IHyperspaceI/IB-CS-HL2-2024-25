package org.will.chapter10;

public interface Measurable {
    default double getMeasure() { return 0; }

    static double average(Measurable[] measures) {
        double sum = 0;
        for (Measurable measurable : measures) {
            sum += measurable.getMeasure();
        }

        if (measures.length > 0) {
            return sum / measures.length;
        }

        return 0;
    }
}
