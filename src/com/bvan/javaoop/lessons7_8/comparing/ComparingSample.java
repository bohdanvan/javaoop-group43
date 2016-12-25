package com.bvan.javaoop.lessons7_8.comparing;

/**
 * @author bvanchuhov
 */
public class ComparingSample {

    public static void main(String[] args) {
        System.out.println(Integer.compare(10, 20)); // < 0
        System.out.println(Integer.compare(5, 5)); // 0
        System.out.println(Integer.compare(100, -100)); // > 0
        System.out.println();

        System.out.println("ABCD".compareTo("EFG")); // < 0
        System.out.println("Homework".compareTo("Home")); // > 0
        System.out.println("Hello".compareTo("Hello")); // 0
        System.out.println();

        Integer x = 10;
        Integer y = 20;
        System.out.println(x.compareTo(y)); // < 0
    }
}
