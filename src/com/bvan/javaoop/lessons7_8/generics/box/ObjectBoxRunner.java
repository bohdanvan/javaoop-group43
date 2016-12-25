package com.bvan.javaoop.lessons7_8.generics.box;

/**
 * @author bvanchuhov
 */
public class ObjectBoxRunner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        ObjectBox catBox = new ObjectBox(dog);

        retrieveCatAndMeow(catBox);
    }

    private static void retrieveCatAndMeow(ObjectBox catBox) {
        Object value = catBox.get();
        if (value instanceof Cat) {
            Cat cat = (Cat) value;
            cat.meow();
        } else {
            System.out.println("Where is my cat???");
        }
    }
}

