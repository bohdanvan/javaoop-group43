package com.bvan.javaoop.lessons1_2.dog;

/**
 * @author bvanchuhov
 */
public class DogRunner {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", "John");
        Owner owner = new Owner();
        owner.giveCommand(3);

        System.out.println(dog);
    }
}
