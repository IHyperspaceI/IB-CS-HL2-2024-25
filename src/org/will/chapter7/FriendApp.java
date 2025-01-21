package org.will.chapter7;

import java.util.ArrayList;

public class FriendApp {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Bob");
        friends.add("Alice");
        friends.add("Jimmy");

        String friend = friends.get(1);
        friends.set(2, "Neutron");

        for (var f : friends) {
            System.out.println(f);
        }

        System.out.println(friends);
    }
}
