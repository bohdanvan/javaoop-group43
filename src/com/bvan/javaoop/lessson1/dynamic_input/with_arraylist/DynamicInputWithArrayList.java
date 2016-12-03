package com.bvan.javaoop.lessson1.dynamic_input.with_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class DynamicInputWithArrayList {

    public static void main(String[] args) {
        List<Integer> clientElems = readClientElemsFromConsole();
        System.out.println(clientElems.toString());
    }

    private static List<Integer> readClientElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        List<Integer> clientElems = new ArrayList<>();
        int n = readInt(scanner);
        while (n != 0) {
            clientElems.add(n);
            n = readInt(scanner);
        }
        return clientElems;
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
