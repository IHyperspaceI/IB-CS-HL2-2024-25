package org.will.chapter10.guilisteners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("You clicked me!");
    }
}
