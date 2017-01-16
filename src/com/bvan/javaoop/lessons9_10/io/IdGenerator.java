package com.bvan.javaoop.lessons9_10.io;

import java.util.Random;

/**
 * @author bvanchuhov
 */
public class IdGenerator {

    private static final Random random = new Random();

    public static long generateId() {
        return random.nextLong();
    }
}
