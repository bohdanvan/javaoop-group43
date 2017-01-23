package com.bvan.javaoop.lessons11_12.multithreading.creation;

import static com.bvan.javaoop.lessons11_12.multithreading.ThreadUtils.println;

/**
 * @author bvanchuhov
 */
public class Drinker implements Runnable {

    private static int nextId = 0;
    private final int id = nextId++;

    @Override
    public void run() {
        println(hello() + " Hello");
        for (int beer = 0; beer < 10; beer++) {
            println(hello() + "I'm drinking " + beer + " beer");
        }
        println(hello() + "I'm finished");
    }

    private String hello() {
        return "I'm " + id + " drinker. ";
    }
}
