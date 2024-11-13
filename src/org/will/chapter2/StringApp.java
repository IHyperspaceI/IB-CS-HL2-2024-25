package org.will.chapter2;

import java.awt.*;

public class StringApp {
    public static void main(String[] args) {
        Rectangle bob = new Rectangle(100, 100, 20, 20);
        Rectangle george = new Rectangle(90, 100);
        System.out.println("bob: " + bob);
        System.out.println("george: " + george);
        Rectangle bob2 = bob;
        System.out.println("bob2: " + bob2);
        bob2.setLocation(50, 50);
        System.out.println("bob: " + bob);
        System.out.println("bob2: " + bob2);
        Rectangle george2 = new Rectangle((int) george.getX(), (int) george.getY(), (int) george.getWidth(), (int) george.getHeight());
        System.out.println("george2: " + george2);
        george2.setLocation(50, 50);
        System.out.println("george: " + george);
        System.out.println("george2: " + george2);
    }

    private static void intro() {
        int width = 20;
        int height = 50;
        int area = width * height;

        System.out.print("width: ");
        System.out.println(width);
        System.out.print("height: ");
        System.out.println(height);
        System.out.print("area: ");
        System.out.println(area);

        String river = "Mississippi";
        river = river.replace('s', 'm');
        System.out.println(river);
    }
}
