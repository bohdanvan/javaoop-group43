package com.bvan.javaoop.lessons11_12.io.user;

/**
 * @author bvanchuhov
 */
public class UsersRunner {

    public static void main(String[] args) {
        Users users = new Users();

        users.add(new User.Builder().setName("John").setAge(25).build());

        for (User user : users) {
            System.out.println(user);
        }
    }
}
