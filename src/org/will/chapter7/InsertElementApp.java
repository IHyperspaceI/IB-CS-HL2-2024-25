package org.will.chapter7;

import java.util.Scanner;

public class InsertElementApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] values = new int[10];
        int currentSize = 5;
        ArrayUtil.fillArray(values, in, currentSize);
        currentSize = ArrayUtil.insertElement(values, 0, 1000, currentSize);
        ArrayUtil.print(values, currentSize);
        currentSize = ArrayUtil.insertElement(values, 4, 2000, currentSize);
        ArrayUtil.print(values, currentSize);
    }
}
