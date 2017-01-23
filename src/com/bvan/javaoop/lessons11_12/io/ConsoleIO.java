package com.bvan.javaoop.lessons11_12.io;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author bvanchuhov
 */
public class ConsoleIO {

    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("Hello");
        printWriter.flush();
    }
}
