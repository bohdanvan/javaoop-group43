package com.bvan.javaoop.lessons7_8.comparing.min;

import com.bvan.javaoop.common.Person;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class MinWithComparatorRunner {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 25),
                new Person("Bob", 30),
                new Person("Phil", 20)
        );

        Person min = MinCalculator.min(people, new NameComparator());
        System.out.println(min);

        Person youngestPerson = MinCalculator.min(people, new AgeComparator());
        System.out.println("youngestPerson = " + youngestPerson);

        Person oldestPerson = MinCalculator.min(people, new ReversedComparator<>(new AgeComparator()));
        System.out.println("oldestPerson = " + oldestPerson);
    }
}

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        String nameA = a.getName();
        String nameB = b.getName();
        return nameA.compareTo(nameB);
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        return Integer.compare(a.getAge(), b.getAge());
    }
}

class ReversedComparator<T> implements Comparator<T> {

    private final Comparator<T> comparator;

    public ReversedComparator(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public int compare(T a, T b) {
        return comparator.compare(b, a);
    }
}
