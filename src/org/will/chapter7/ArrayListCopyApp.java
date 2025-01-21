package org.will.chapter7;

import java.util.ArrayList;

public class ArrayListCopyApp {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Bob");
        friends.add("Alice");
        friends.add("Jimmy");

        friends.add(0, "Carter");

        System.out.println(friends.get(friends.size() - 1));

        friends.remove(2);

        ArrayList<String> friends2 = new ArrayList<>(friends);
        System.out.println(friends);
    }
}
