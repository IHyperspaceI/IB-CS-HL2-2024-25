package org.will.chapter10;

public class MeasureTester2 {
    public static void main(String[] args) {
        class AreaMeasure implements Measure {

            @Override
            public double measure(Object anObject) {
                return 0;
            }
        }

        Measure measure = new AreaMeasurer();
        double averageArea = Data.average(new Measure[3], measure);
    }
}
