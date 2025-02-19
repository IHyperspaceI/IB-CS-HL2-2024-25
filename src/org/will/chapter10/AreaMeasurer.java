package org.will.chapter10;

import java.awt.*;

public class AreaMeasurer implements Measure{
    @Override
    public double measure(Object anObject) {
        Rectangle rect = (Rectangle) anObject;
        double area = rect.getWidth() * rect.getHeight();
        return area;
    }
}
