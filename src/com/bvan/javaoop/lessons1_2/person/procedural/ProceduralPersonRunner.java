package com.bvan.javaoop.lessons1_2.person.procedural;

/**
 * @author bvanchuhov
 */
public class ProceduralPersonRunner {

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Bob";
        person.age = 30;

        String message = getPersonInfo(person);

        System.out.println(message);
    }

    private static String getPersonInfo(Person person) {
        return "Hello, I'm " + person.name + ", "
                + person.age + " years old";
    }
}
