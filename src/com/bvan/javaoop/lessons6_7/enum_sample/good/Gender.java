package com.bvan.javaoop.lessons6_7.enum_sample.good;

/**
 * @author bvanchuhov
 */
public enum Gender {
    MALE("male"),
    FEMALE("female"),
    UNDEFINED("unknown");

    private final String genderName;

    Gender(String genderName) {
        this.genderName = genderName;
    }

    public String getGenderName() {
        return genderName;
    }
}
