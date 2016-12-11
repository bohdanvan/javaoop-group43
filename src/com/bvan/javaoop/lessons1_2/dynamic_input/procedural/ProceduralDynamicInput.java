package com.bvan.javaoop.lessons1_2.dynamic_input.procedural;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ProceduralDynamicInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] userElems = new int[10];
        int size = 0;

        int n = readInt(scanner);
        while (n != 0) {
            if (userElems.length == size) {
                userElems = grow(userElems);
            }
            userElems[size++] = n;

            n = readInt(scanner);
        }

        printElems(userElems, size);
    }

    private static void printElems(int[] clientElems, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(clientElems[i] + " ");
        }
    }

    private static int[] grow(int[] array) {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
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

    private static int[] addLast(int[] array, int n) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[newArray.length - 1] = n;
        array = newArray;
        return array;
    }
}
