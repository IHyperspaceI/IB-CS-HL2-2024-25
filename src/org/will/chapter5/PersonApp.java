package org.will.chapter5;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.getAge());
        System.out.println(person.getName());

        System.out.println("I got here lmao");
        if (person.getName() != null) {
            System.out.println(person.getName().toUpperCase());
        } else {
            System.out.println("No name!");
        }
        System.out.println("I got here lmao");
    }
}
