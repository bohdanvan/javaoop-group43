package com.bvan.javaoop.lessons7_8.comparing.min;

import java.util.Arrays;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class MinCalculatorRunner {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 20);
        Integer min = MinCalculator.min(integers);
        System.out.println(min);

        List<String> names = Arrays.asList("John", "Bob");
        String minName = MinCalculator.min(names);
        System.out.println(minName);
    }
}
