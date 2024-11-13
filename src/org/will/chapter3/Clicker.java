package org.will.chapter3;

public class Clicker {
    private int count;

    public int getCount() {
        return count;
    }

    public void click() {
        count++;
    }

    public void reset() {
        count = 0;
    }
}
