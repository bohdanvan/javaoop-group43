package com.bvan.javaoop.lessons7_8.generics.box;

/**
 * @author bvanchuhov
 */
public class ObjectBox {

    private final Object value;

    public ObjectBox(Object value) {
        this.value = value;
    }

    public Object get() {
        return value;
    }

    @Override
    public String toString() {
        return "ObjectBox(" + value + ")";
    }
}