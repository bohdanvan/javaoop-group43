package com.bvan.javaoop.lessons5_6.enum_sample.good;

/**
 * @author bvanchuhov
 */
public class EnumSample {

    public static void main(String[] args) {
        Gender male = Gender.UNDEFINED;
        System.out.println(male.name());
        System.out.println(male.ordinal());
    }
}
