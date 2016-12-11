package com.bvan.javaoop.lessons3_4.overloading;

/**
 * @author bvanchuhov
 */
public class OverloadingSample {

    public static void main(String[] args) {
        int x = Math.min(10, 20);
        double d = Math.min(10.0, 20.0);

        System.out.println("x = " + x);
        System.out.println("d = " + d);
    }
}
