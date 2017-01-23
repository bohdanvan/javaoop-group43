package com.bvan.javaoop.lessons11_12.io.user;

import java.util.Random;

/**
 * @author bvanchuhov
 */
public class IdGenerator {

    private static Random random = new Random();

    public static long generateId() {
        return random.nextLong();
    }
}
