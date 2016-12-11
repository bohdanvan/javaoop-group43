package com.bvan.javaoop.lessons1_2.dynamic_input.oop;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class OOPDynamicInput {

    public static void main(String[] args) {
        DynamicArray userElems = readUserElemsFromConsole();
        System.out.println(userElems.toString());
    }

    private static DynamicArray readUserElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        DynamicArray userElems = new DynamicArray();
        int n = readInt(scanner);
        while (n != 0) {
            userElems.add(n);
            n = readInt(scanner);
        }
        return userElems;
    }

    private static int readInt(Scanner scanner) {
        System.out.print(">> ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Illegal input");
            System.out.print(">> ");
        }
        return scanner.nextInt();
    }
}
