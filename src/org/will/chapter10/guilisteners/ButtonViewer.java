package org.will.chapter10.guilisteners;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ButtonViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("p r e s s");
        frame.add(button);

        ActionListener listener = new ClickListener();
        button.addActionListener(listener);

        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
