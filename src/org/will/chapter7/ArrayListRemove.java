package org.will.chapter7;

import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");

        removeSmall(words);

        System.out.println(words);
    }

    private static void removeSmall(ArrayList<String> list) {
        int i = 0;
        while (i < list.size()) {
            String word = list.get(i);
            if (word.length() <= 3) {
                list.remove(i);
                continue;
            }
            i++;
        }
        /*for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            if (word.length() <= 3) {
                list.remove(i);
                i--;
            }
        }*/
    }
}
