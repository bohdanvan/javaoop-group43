package com.bvan.javaoop.lessson1.dog;

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
