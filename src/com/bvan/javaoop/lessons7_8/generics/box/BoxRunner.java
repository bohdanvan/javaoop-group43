package com.bvan.javaoop.lessons7_8.generics.box;

/**
 * @author bvanchuhov
 */
public class BoxRunner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Box<Cat> catBox = new Box<>(cat);

        retrieveCatAndMeow(catBox);
    }

    private static void retrieveCatAndMeow(Box<Cat> catBox) {
        Cat cat = catBox.get();
        cat.meow();
    }
}
