package org.will.chapter1;

public class Tree {
    private static int size = 50;
    public static void main(String[] args) {
        for (int i = 0; i <= size; i++) {
            int remaining = i;
            while (remaining > 0) {
                System.out.print("*");
                remaining--;
            }
            System.out.println();
        }
    }
}
