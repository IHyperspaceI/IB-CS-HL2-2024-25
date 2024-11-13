package org.will.chapter2.art;

import javax.swing.*;

public class RectangleViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Two Rectangles");
        frame.setSize(400, 400);

        RectangleComponent component = new RectangleComponent();
        frame.add(component);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
