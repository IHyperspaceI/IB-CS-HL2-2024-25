package org.will.chapter10;

import java.awt.*;

public class AnonymousApp {
    public static void main(String[] args) {
        Measure measure = new Measure() {
            @Override
            public double measure(Object anObject) {
                Rectangle r = (Rectangle) anObject;
                return r.getHeight() * r.getWidth();
            }
        };

        double area = Data.average(new Rectangle[3], measure);
    }
}
