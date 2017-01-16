package com.bvan.javaoop.lessons9_10.io;

import static com.bvan.javaoop.lessons9_10.io.Validator.isAge;
import static com.bvan.javaoop.lessons9_10.io.Validator.isInt;
import static com.bvan.javaoop.lessons9_10.io.Validator.isLong;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Procedural IO utility class.
 *
 * @author bvanchuhov
 */
public class UserIOUtils {

    public static final String CSV_DELIMITER = ";";

    private UserIOUtils() {
    }

    // Bin Output

    public static void writeUsersIntoBinFile(String fileName, List<User> users) throws IOException {
        try (ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutput.writeObject(users);
        }
    }

    // Bin Input

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static List<User> readUsersFromBinFile(String fileName) throws IOException {
        try (ObjectInput objectInput = new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<User>)objectInput.readObject();
        } catch (ClassNotFoundException e) {
            throw new IllegalFormatException("Illegal file: " + fileName, e);
        }
    }

    // Text Output

    public static void writeUsersIntoFile(String fileName, List<User> users) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            writeUsers(users, writer);
        }
    }

    public static void writeUsersIntoConsole(List<User> users) {
        PrintWriter consoleWriter = new PrintWriter(new OutputStreamWriter(System.out));
        writeUsers(users, consoleWriter);
        consoleWriter.flush(); // flush the buffer of PrintWriter
    }

    private static void writeUsers(List<User> users, PrintWriter writer) {
        for (User user : users) {
            writer.println(user);
        }
    }

    // Text Input

    public static List<User> readUsersFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return readUsers(reader);
        }
    }

    private static List<User> readUsers(BufferedReader reader) throws IOException {
        List<User> res = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            if (line.trim().isEmpty()) {
                continue;
            }

            User user = parseUser(line);
            res.add(user);
        }

        return res;
    }

    /**
     * @throws IllegalFormatException
     * @throws IOException
     */
    public static User readUserFromFile(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            return readUser(reader);
        } finally {
            closeReader(reader);
        }
    }

    public static void closeReader(BufferedReader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @throws IllegalFormatException
     * @throws IOException
     */
    public static User readUser(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        return parseUser(line);
    }

    // User Parsing

    /**
     * @throws IllegalFormatException
     */
    private static User parseUser(String line) {
        String[] tokens = line.split(CSV_DELIMITER);

        if (tokens.length < 4) {
            throw new IllegalFormatException("Number of values < 4: " + line);
        }
        User user = new User();
        user.setId(parseId(tokens[0]));
        user.setName(tokens[1]);
        user.setAge(parseAge(tokens[2]));
        user.setGender(parseGender(tokens[3]));

        return user;
    }

    private static Gender parseGender(String s) {
        if (!Gender.isGender(s)) {
            throw new IllegalFormatException("Illegal gender: " + s);
        }
        return Gender.valueOf(s);
    }

    private static int parseAge(String s) {
        if (!isInt(s)) {
            throw new IllegalFormatException("Illegal age: " + s);
        }
        int age = Integer.parseInt(s);
        if (!isAge(age)) {
            throw new IllegalFormatException("Age should be in the range [1..120]: " + s);
        }
        return age;
    }

    private static long parseId(String s) {
        if (!isLong(s)) {
            throw new IllegalFormatException("Illegal id: " + s);
        }
        return Long.parseLong(s);
    }
}
