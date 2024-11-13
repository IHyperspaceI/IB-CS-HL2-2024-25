package org.will.chapter2.art;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class ShapeComponent extends JComponent {
    Color theColor = new Color(42, 140, 14);
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g; //explicit cast, changing the type of the variable

        Ellipse2D.Double ellipse = new Ellipse2D.Double(50, 50, 50, 50);
        g2.setColor(Color.RED);
        g2.draw(ellipse);

        Line2D.Double line = new Line2D.Double(58, 58, 94, 94);
        g2.setColor(Color.BLUE);
        g2.draw(line);

        Point2D.Double from = new Point2D.Double(90, 80);
        Point2D.Double to = new Point2D.Double(120, 120);

        Line2D.Double pointLine = new Line2D.Double(from, to);
        g2.setColor(Color.GREEN);
        g2.draw(pointLine);

        g2.drawString("ballz", 200, 200);

        Ellipse2D.Double fillCircle = new Ellipse2D.Double(100, 100, 250, 250);
        g2.setColor(Color.DARK_GRAY);
        g2.fill(fillCircle);
    }
}
