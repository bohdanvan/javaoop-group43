package com.bvan.javaoop.lessons9_10.equal_hashcode;

import com.bvan.javaoop.common.Person;

/**
 * @author bvanchuhov
 */
public class EqualsHashCode {

    public static void main(String[] args) {
        Person a = new Person("John", 25);
        Person b = new Person("John", 25);
        Person c = new Person("Bob", 30);

        System.out.println("Equals:");
        System.out.println(a.equals(a)); // true
        System.out.println(a.equals(b)); // true
        System.out.println(b.equals(a)); // true
        System.out.println(a.equals(c)); // false
        System.out.println();

        System.out.println("Hash code:");
        System.out.println(a.hashCode() == a.hashCode()); // true
        System.out.println(a.hashCode() == b.hashCode()); // true
        System.out.println(a.hashCode() == c.hashCode()); // false, maybe true
        System.out.println();


        System.out.println("a.hashCode() = " + a.hashCode());
        System.out.println("b.hashCode() = " + b.hashCode());
        System.out.println("c.hashCode() = " + c.hashCode());
    }
}
