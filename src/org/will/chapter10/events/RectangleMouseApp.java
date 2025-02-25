package org.will.chapter10.events;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class RectangleMouseApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rectangle Click");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        RectangleComponent tangle = new RectangleComponent();
        frame.add(tangle);

        class MousePressListener implements MouseListener {

            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                tangle.moveTo(x, y);
                System.out.printf("X: %d, Y: %d\n", x, y);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        }

        class KeyboardListener implements KeyListener {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                String key = KeyStroke.getKeyStrokeForEvent(e).toString();
                System.out.println(key);
                KeyStroke stroke = KeyStroke.getKeyStrokeForEvent(e);

                if (stroke.toString().charAt(0) == 'A') {
                    tangle.moveTo(0, 0);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        }

        MouseListener listener = new MousePressListener();
        KeyListener keyListener = new KeyboardListener();
        tangle.addMouseListener(listener);
        //Needed for key press events
        tangle.setFocusable(true);
        tangle.requestFocus();
        tangle.addKeyListener(keyListener);

        frame.setVisible(true);
    }
}
