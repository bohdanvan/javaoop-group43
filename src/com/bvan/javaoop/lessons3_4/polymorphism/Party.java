package com.bvan.javaoop.lessons3_4.polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Party {

    public static void main(String[] args) {
        List<Person> guests = new ArrayList<>();
        guests.add(new Person("John"));
        guests.add(new Person());
        guests.add(new PartyMaker("Bob"));

        askHello(guests);
    }

    private static void askHello(List<Person> guests) {
        for (Person guest : guests) {
            guest.howAreYou();
        }
    }
}

class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        this("UNDEFINED");
    }

    public void howAreYou() {
        System.out.println("I'm fine, I'm " + name);
    }

    protected String getName() {
        return name;
    }
}

class PartyMaker extends Person {

    public PartyMaker(String name) {
        super(name);
    }

    @Override
    public void howAreYou() {
        System.out.println("I'm " + getName() + ". Let's make a party. Give me a beer!!!");
    }
}
