package org.will.chapter10;

public class Computer implements Measurable, Comparable<Computer> {
    private double memory;
    public Computer(double memory) {
        this.memory = memory;
    }

    @Override
    public double getMeasure() {
        return memory;
    }

    @Override
    public int compareTo(Computer o) {
        if (memory < o.memory) {
            return -1;
        } else if (memory > o.memory) {
            return 1;
        } else {
            return 0;
        }
    }
}
