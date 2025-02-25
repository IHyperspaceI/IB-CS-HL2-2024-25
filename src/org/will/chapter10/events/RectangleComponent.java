package org.will.chapter10.events;

import javax.swing.*;
import java.awt.*;

public class RectangleComponent extends JComponent {
    private static final int X = 100;
    private static final int Y = 100;
    private static final int WIDTH = 50;
    private static final int HEIGHT = 20;

    private Rectangle box;

    @Override
    public int getX() {
        return box.x;
    }

    @Override
    public int getY() {
        return box.y;
    }

    public RectangleComponent() {
        box = new Rectangle(X, Y, WIDTH, HEIGHT);
    }

    public void move(int deltaX, int deltaY) {
        box.translate(deltaX, deltaY);
        repaint();
    }

    public void moveTo(int x, int y) {
        box.setLocation(x, y);
        repaint();
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(box);
    }
}
