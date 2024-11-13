package org.will.chapter2.art;

import javax.swing.*;
import java.awt.*;

public class RectangleComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g; //explicit cast, changing the type of the variable
        Rectangle rectangle = new Rectangle(100, 100, 200, 200);
        g2.draw(rectangle);

        rectangle.translate(-10, -10);
        g2.draw(rectangle);
    }
}
