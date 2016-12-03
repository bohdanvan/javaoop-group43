package com.bvan.javaoop.lessson1.dog;

/**
 * @author bvanchuhov
 */
public class Owner {

    private Dog dog;

    public Owner() {
    }

    public Owner(Dog dog) {
        this.dog = dog;
    }

    public void giveCommand(int barksCount) {
        if (dog != null) {
            for (int i = 0; i < barksCount; i++) {
                dog.bark();
            }
        } else {
            System.out.println("Sorry, I have no dogs");
        }
    }
}
