package org.will.chapter3.draw;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Car {
    private int x;
    private int y;

    public Car(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2) {
        Rectangle body = new Rectangle(x, y + 10, 60, 10);

        Ellipse2D.Double lWheel = new Ellipse2D.Double(x + 10, y + 20, 10, 10);
        Ellipse2D.Double rWheel = new Ellipse2D.Double(x + 40, y + 20, 10, 10);

        Line2D.Double lWindow = new Line2D.Double(x + 10, y + 10, x + 20, y);
        Line2D.Double rWindow = new Line2D.Double(x + 40, y, x + 50, y + 10);

        Line2D.Double roof = new Line2D.Double(x + 20, y, x + 40, y);

        g2.draw(body);
        g2.draw(lWheel);
        g2.draw(rWheel);
        g2.draw(lWindow);
        g2.draw(rWindow);
        g2.draw(roof);
    }
}