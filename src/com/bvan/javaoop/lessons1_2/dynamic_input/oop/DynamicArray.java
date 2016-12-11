package com.bvan.javaoop.lessons1_2.dynamic_input.oop;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class DynamicArray {

    private static final int INITIAL_CAPACITY = 10;
    private static final int GROWTH_FACTOR = 2;

    private int[] elems = new int[INITIAL_CAPACITY];
    private int size = 0;

    public void add(int n) {
        if (elems.length == size) {
            elems = grow(elems);
        }
        elems[size++] = n;
    }

    private int[] grow(int[] array) {
        int[] newArray = new int[array.length * GROWTH_FACTOR];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elems, size)); // TODO: use StringBuilder for building result string
    }
}
