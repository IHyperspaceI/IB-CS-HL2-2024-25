package org.will.chapter7.primitivearrays;

public class FillApp {
    public static void main(String[] args) {
        int[] values = new int[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = i * i;
        }

        for (int value : values) {
            System.out.println(value);
        }
    }
}
