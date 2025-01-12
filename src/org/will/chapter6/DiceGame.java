package org.will.chapter6;

public class DiceGame {
    public static void main(String[] args) {
        Die die = new Die(6);
        final int ROLLS = 20;

        for (int i = 0; i < ROLLS; i++) {
            int roll = die.roll();
            System.out.println(roll);
        }
    }
}
