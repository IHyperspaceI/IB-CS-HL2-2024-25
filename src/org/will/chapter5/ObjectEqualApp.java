package org.will.chapter5;

import java.awt.*;

public class ObjectEqualApp {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(10, 10, 30, 50);
        Rectangle box2 = new Rectangle(10, 10, 30, 50);
        Rectangle box3 = box2;

        if (box == box2) {
            System.out.println("box and box2 are the same object");
        } else {
            System.out.println("box and box2 are different objects");
        }

        if (box2 == box3){
            System.out.println("box2 and box3 are the same object");
        } else {
            System.out.println("box2 and box3 are different objects");
        }

        if (box.equals(box2)) {
            System.out.println("box and box2 have the same contents");
        } else {
            System.out.println("box and box2 have different contents");
        }
    }
}
