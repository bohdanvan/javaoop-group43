package com.bvan.javaoop.lessons7_8.comparing.min;

import java.util.Comparator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class MinCalculator {

    /**
     * @throws IllegalArgumentException if list is empty
     */
    public static Integer intMin(List<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("empty list");
        }
        Integer min = list.get(0);

        for (Integer elem : list) {
            if (min > elem) {
                min = elem;
            }
        }

        return min;
    }

    public static Double doubleMin(List<Double> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("empty list");
        }
        Double min = list.get(0);

        for (Double elem : list) {
            if (min > elem) {
                min = elem;
            }
        }

        return min;
    }

    public static <T extends Comparable<T>> T min(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("empty list");
        }
        T min = list.get(0);

        for (T elem : list) {
            if (min.compareTo(elem) > 0) {
                min = elem;
            }
        }

        return min;
    }

    public static <T> T min(List<T> list, Comparator<T> comparator) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("empty list");
        }
        T min = list.get(0);

        for (T elem : list) {
            if (comparator.compare(min, elem) > 0) {
                min = elem;
            }
        }

        return min;
    }
}
