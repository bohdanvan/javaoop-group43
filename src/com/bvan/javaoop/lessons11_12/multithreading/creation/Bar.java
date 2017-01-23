package com.bvan.javaoop.lessons11_12.multithreading.creation;

import static com.bvan.javaoop.lessons11_12.multithreading.ThreadUtils.println;

/**
 * @author bvanchuhov
 */
public class Bar {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Drinker());
        thread.start();

        thread.join();

        println("Bar is closed");
    }
}
