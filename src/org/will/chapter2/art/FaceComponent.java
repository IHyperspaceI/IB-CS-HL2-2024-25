package org.will.chapter2.art;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class FaceComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Ellipse2D.Double head = new Ellipse2D.Double(5, 10, 100, 150);
        g2.draw(head);

        Ellipse2D.Double lEye = new Ellipse2D.Double(25, 70, 15, 15);
        g2.setColor(Color.GREEN);
        g2.fill(lEye);

        Ellipse2D.Double rEye = new Ellipse2D.Double(75, 70, 15, 15);
        g2.setColor(Color.GREEN);
        g2.fill(rEye);

        Line2D.Double mouth = new Line2D.Double(30 , 110, 80, 110);
        g2.setColor(Color.RED);
        g2.draw(mouth);
    }
}
