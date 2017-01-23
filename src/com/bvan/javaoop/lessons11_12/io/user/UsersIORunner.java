package com.bvan.javaoop.lessons11_12.io.user;

import static com.bvan.javaoop.lessons11_12.io.user.UserIOUtils.readUsersFromFile;
import static com.bvan.javaoop.lessons11_12.io.user.UserIOUtils.writeUsersIntoBinFile;
import static com.bvan.javaoop.lessons11_12.io.user.UserIOUtils.writeUsersIntoFile;
import java.io.*;

/**
 * @author bvanchuhov
 */
public class UsersIORunner {

    public static final String TEXT_INPUT_FILE = "files/users/users-in.csv";
    public static final String TEXT_OUTPUT_FILE = "files/users/users-out.csv";

    public static final String BIN_FILE = "files/users/users.dat";

    public static void main(String[] args) {
        try {
            Users users = readUsersFromFile(TEXT_INPUT_FILE);
            writeUsersIntoFile(TEXT_OUTPUT_FILE, users);

            writeUsersIntoBinFile(BIN_FILE, users);
        } catch (IOException e) {
            System.out.println("Sorry, IO Error: " + e.getMessage());
        } catch (IllegalFormatException e) {
            System.out.println("Sorry, format error: " + e.getMessage());
        }
    }
}
