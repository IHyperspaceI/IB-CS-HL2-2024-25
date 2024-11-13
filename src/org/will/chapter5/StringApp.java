package org.will.chapter5;

import javax.sound.midi.Soundbank;

public class StringApp {
    public static void main(String[] args) {
        String str1 = "bob";
        String str2 = "bob";

        if (str1.equals(str2)) {
            System.out.println("strings are equal");
        } else {
            System.out.println("strings aren't equal");
        }

        String str3 = "Robert";

        if (str1.compareTo(str3) < 0) {
            System.out.println("bob comes first");
        } else {
            System.out.println("robert comes first");
        }
    }
}
