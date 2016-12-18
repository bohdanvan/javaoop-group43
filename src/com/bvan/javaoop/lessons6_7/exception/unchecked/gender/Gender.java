package com.bvan.javaoop.lessons6_7.exception.unchecked.gender;

/**
 * @author bvanchuhov
 */
public enum Gender {
    MALE, FEMALE, UNDEFINED;

    public static boolean isGender(String genderName) {
        for (Gender gender : Gender.values()) {
            if (gender.name().equals(genderName)) {
                return true;
            }
        }
        return false;
    }
}
