package com.bvan.javaoop.lessons1_2.person.oop;

/**
 * @author bvanchuhov
 */
public class OOPPersonRunner {

    public static void main(String[] args) {
        Person person = new Person("John", 25);
        String message = person.sayHello();
        System.out.println(message);

        int age = person.getAge();
        System.out.println("age = " + age);
    }
}
