package com.bvan.javaoop.lessson1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ArrayListSample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 1000_000; i++) {
            list.add(i);
        }

        System.out.println(list);
    }
}
