package com.bvan.javaoop.lessons9_10.map;

import com.bvan.javaoop.common.Person;
import java.util.*;

/**
 * @author bvanchuhov
 */
public class SocialNetwork {

    public static void main(String[] args) {
        Map<Long, Person> idToUserMap = new HashMap<>();

        idToUserMap.put(10L, new Person("John", 25)); // O(1)
        idToUserMap.put(20L, new Person("Bob", 30));
        idToUserMap.put(50L, new Person("Phil", 20));
        idToUserMap.put(40L, null);

        System.out.println(idToUserMap.get(50L)); // Person{name='Phil', age=20}
        System.out.println(idToUserMap.get(30L)); // null, not found
        System.out.println(idToUserMap.get(40L)); // value=null
        System.out.println();

        System.out.println(idToUserMap.containsKey(30L)); // false
        System.out.println(idToUserMap.containsKey(40L)); // true

        Set<Long> keys = idToUserMap.keySet();
        Collection<Person> values = idToUserMap.values();
        Set<Map.Entry<Long, Person>> entries = idToUserMap.entrySet();

        System.out.println("Entries:");
        for (Map.Entry<Long, Person> entry : entries) {
            System.out.println(entry);
        }
    }
}
