package com.bvan.javaoop.lessons9_10.io;

/**
 * @author bvanchuhov
 */
public enum Gender {
    MALE, FEMALE, UNDEFINED;

    public static boolean isGender(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        for (Gender gender : Gender.values()) {
            if (gender.name().equals(s)) {
                return true;
            }
        }
        return false;
    }
}
