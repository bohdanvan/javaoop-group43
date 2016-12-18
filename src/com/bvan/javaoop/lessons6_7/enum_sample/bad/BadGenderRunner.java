package com.bvan.javaoop.lessons6_7.enum_sample.bad;

import static com.bvan.javaoop.lessons6_7.enum_sample.bad.BadPerson.*;

/**
 * @author bvanchuhov
 */
public class BadGenderRunner {

    public static void main(String[] args) {
        BadPerson person = new BadPerson("John", 25, MALE);
        String genderName = person.getGenderName();

        System.out.println(person);
        System.out.println("genderName = " + genderName);
    }
}
