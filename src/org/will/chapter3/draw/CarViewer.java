package org.will.chapter3.draw;

import javax.swing.*;

public class CarViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Car");
        frame.setSize(600, 400);
        CarComponent car = new CarComponent();
        frame.add(car);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
