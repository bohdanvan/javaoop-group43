package com.bvan.javaoop.lessons1_2.person.oop;

/**
 * @author bvanchuhov
 */
public class Validator {

    public static boolean isAge(int age) {
        return age > 0 && age <= 120;
    }
}
