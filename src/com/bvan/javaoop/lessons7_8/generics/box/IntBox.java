package com.bvan.javaoop.lessons7_8.generics.box;

/**
 * @author bvanchuhov
 */
public class IntBox {

    private final int value;

    public IntBox(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    @Override
    public String toString() {
        return "IntBox(" + value + ")";
    }
}
