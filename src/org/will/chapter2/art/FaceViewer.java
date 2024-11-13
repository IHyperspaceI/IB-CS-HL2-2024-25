package org.will.chapter2.art;

import javax.swing.*;

public class FaceViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Face");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        FaceComponent face = new FaceComponent();
        frame.add(face);

        frame.setVisible(true);
    }
}
