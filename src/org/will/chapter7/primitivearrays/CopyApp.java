package org.will.chapter7.primitivearrays;

import java.util.Scanner;

public class CopyApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] values = new int[5];
        int currentSize = values.length;
        ArrayUtil.fillArray(values, in, currentSize);
        ArrayUtil.print(values, currentSize);
        System.out.println(values);
        int[] copy = ArrayUtil.copyArray(values, values.length);
        ArrayUtil.print(copy, currentSize);
        System.out.println(copy);
    }
}
