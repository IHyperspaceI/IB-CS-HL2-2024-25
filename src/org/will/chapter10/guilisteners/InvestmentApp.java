package org.will.chapter10.guilisteners;

import org.will.chapter10.BankAccount;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvestmentApp {
    private static final double INITIAL_BALANCE = 100;
    private static final double INTEREST_RATE = 100;
    public static void main(String[] args) {
        BankAccount account = new BankAccount(INITIAL_BALANCE);

        JFrame frame = new JFrame("hi");
        JPanel panel = new JPanel(new GridLayout(2, 1));
        JButton button = new JButton("Increment year");
        JLabel label = new JLabel("Balance: $100");


        button.setMaximumSize(new Dimension(200, 100));

        panel.add(button);
        panel.add(label);

        frame.add(panel);
        frame.setSize(200, 150);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        class AddInterestListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                double interest = account.getBalance() * INTEREST_RATE / 100;
                account.deposit(interest);
                label.setText(String.format("Balance: $%.2f", account.getBalance()));
            }
        }


        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);

        frame.setVisible(true);
    }
}
