package com.bvan.javaoop.lessons1_2.person.oop;

/**
 * @author bvanchuhov
 */
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        checkAge(age);
        this.name = name;
        this.age = age;
    }

    public String sayHello() {
        return "Hello, I'm " + name + ", " + age + " years old";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        checkAge(age);
        this.age = age;
    }

    private void checkAge(int age) {
        if (!Validator.isAge(age)) {
            throw new IllegalArgumentException("incorrect age: " + age);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
