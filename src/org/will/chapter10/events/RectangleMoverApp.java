package org.will.chapter10.events;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RectangleMoverApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rectangle Mover");
        RectangleComponent tangle = new RectangleComponent();
        frame.add(tangle);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        class TimerListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                int randX = new Random().nextInt(-1, 2);
                int randY = new Random().nextInt(-1, 2);

                if (tangle.getX() <= 0) {
                    tangle.move(30, randY);
                    System.out.printf("Hit X at %d, %d\n", tangle.getX(), tangle.getY());
                } else if (tangle.getX() >= frame.getWidth() - tangle.getWidth()) {
                    tangle.move(-30, randY);
                    System.out.printf("Hit X at %d, %d\n", tangle.getX(), tangle.getY());
                } else if (tangle.getY() >= frame.getHeight() - tangle.getHeight()) {
                    tangle.move(randX, -30);
                    System.out.printf("Hit Y at %d, %d\n", tangle.getX(), tangle.getY());
                } else if (tangle.getY() <= 0) {
                    tangle.move(randX, 30);
                    System.out.printf("Hit Y at %d, %d\n", tangle.getX(), tangle.getY());
                } else {
                    tangle.move(randX, randY);
                }
            }
        }

        ActionListener listener = new TimerListener();
        Timer timer = new Timer(100, listener);
        frame.setVisible(true);
        timer.start();
    }
}
