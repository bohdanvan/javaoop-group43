package com.bvan.javaoop.lessons11_12.io.user;

/**
 * @author bvanchuhov
 */
public class UserRunner {

    public static void main(String[] args) {
        User john = new User.Builder()
                .setName("John")
                .setAge(25)
                .build();

        System.out.println(john);

    }
}
