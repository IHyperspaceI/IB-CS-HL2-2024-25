package org.will.chapter10.guilisteners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaClickViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("p r e s s");
        frame.add(button);

        button.addActionListener((ActionEvent event) -> System.out.println("clicked"));

        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
