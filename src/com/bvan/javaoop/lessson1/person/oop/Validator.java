package com.bvan.javaoop.lessson1.person.oop;

/**
 * @author bvanchuhov
 */
public class Validator {

    public static boolean isAge(int age) {
        return age > 0 && age <= 120;
    }
}
