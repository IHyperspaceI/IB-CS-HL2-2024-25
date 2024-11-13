package org.will.chapter2.art;

import javax.swing.*;

public class ShapeViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes");
        frame.setSize(400, 400);

        ShapeComponent component = new ShapeComponent();
        frame.add(component);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
