package org.will.chapter3.draw;

import javax.swing.*;
import java.awt.*;

public class CarComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Car car1 = new Car(0, 0);
        car1.draw(g2);

        int width = getWidth() - 60;
        int height = getHeight() - 30;

        Car car2 = new Car(width, height);
        car2.draw(g2);

        Car car3 = new Car(50, 50);
        car3.draw(g2);
    }
}