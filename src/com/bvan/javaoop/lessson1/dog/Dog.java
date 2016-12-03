package com.bvan.javaoop.lessson1.dog;

/**
 * @author bvanchuhov
 */
public class Dog {

    private String name;
    private String ownerName;

    public Dog(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
    }

    public void bark() {
        System.out.println("Gav-gav");
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
