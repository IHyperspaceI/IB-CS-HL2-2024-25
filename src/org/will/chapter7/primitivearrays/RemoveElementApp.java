package org.will.chapter7.primitivearrays;

import java.util.Scanner;

public class RemoveElementApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] values = new int[5];
        ArrayUtil.fillArray(values, in);
        ArrayUtil.print(values, values.length);
        int currentSize = ArrayUtil.removeElement(values, values.length, 2);
        ArrayUtil.print(values, currentSize);
    }
}
