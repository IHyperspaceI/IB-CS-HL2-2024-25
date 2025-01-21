package org.will.chapter7.primitivearrays;

import java.util.Scanner;

public class SwapApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] values = new int[5];
        int currentSize = values.length;
        ArrayUtil.fillArray(values, in, currentSize);
        ArrayUtil.print(values, currentSize);
        ArrayUtil.swap(values, 0, values.length - 1);
        ArrayUtil.print(values, currentSize);
    }
}
