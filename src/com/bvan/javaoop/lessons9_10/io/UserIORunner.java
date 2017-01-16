package com.bvan.javaoop.lessons9_10.io;

import static com.bvan.javaoop.lessons9_10.io.UserIOUtils.*;
import java.io.IOException;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class UserIORunner {

    public static final String INPUT_FILE = "files/users.csv";
    public static final String OUTPUT_FILE = "files/users.out";
    public static final String BIN_FILE = "files/users.dat";

    public static void main(String[] args) throws IOException {
        try {
            List<User> users = readUsersFromFile(INPUT_FILE);
            writeUsersIntoFile(OUTPUT_FILE, users);
            writeUsersIntoBinFile(BIN_FILE, users);
            writeUsersIntoConsole(users);
            System.out.println("DONE");
        } catch (IOException e) {
            System.out.println("Sorry, IO Error exists. " + e.getMessage());
            e.printStackTrace();
        } catch (IllegalFormatException e) {
            System.out.println("Illegal format. " + e.getMessage());
        }
    }
}
