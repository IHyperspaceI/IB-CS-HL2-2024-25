package org.will.chapter6;

import java.util.Random;

public class Die {
    private int sides;
    private Random generator;

    public Die(int sides) {
        this.sides = sides;
        generator = new Random();
    }

    public int roll() {
        return 1 + generator.nextInt(sides);
    }
}
