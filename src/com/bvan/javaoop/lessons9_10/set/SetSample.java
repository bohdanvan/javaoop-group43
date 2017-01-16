package com.bvan.javaoop.lessons9_10.set;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class SetSample {

    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(15, 20, 15, 20, 30, 40, 35, 30);

        Set<Integer> agesSet = new TreeSet<>(ages);
        System.out.println(agesSet);
    }
}
