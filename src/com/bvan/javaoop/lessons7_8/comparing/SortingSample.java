package com.bvan.javaoop.lessons7_8.comparing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class SortingSample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "John",
                "Bob",
                "Phil",
                "Ted",
                "Jack",
                "Mustafa"
        );

        Collections.sort(names);
        System.out.println("Alphabetical order, ASC: " + names);

        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Alphabetical order, DESC: " + names);

        Collections.sort(names, new LengthComparator());
        System.out.println("Length order, ASC: " + names);

        Collections.sort(names,
                Collections.reverseOrder(new LengthComparator()));
        System.out.println("Length order, DESC: " + names);
    }
}

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return Integer.compare(a.length(), b.length());
    }
}
