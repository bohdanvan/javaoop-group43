package com.bvan.javaoop.lessons7_8.generics.swap;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class SwapperRunner {

    public static void main(String[] args) {
        String[] names = {"John", "Bob"};
        Swapper.swap(names, 0, 1);
        System.out.println(Arrays.toString(names));

        Integer[] integers = {1, 2};
        Swapper.swap(integers, 0, 1);
        System.out.println(Arrays.toString(integers));
    }
}
