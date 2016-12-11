package com.bvan.javaoop.lessons3_4.rectangle.oop;

import com.bvan.javaoop.lessons3_4.rectangle.Rectangle;

/**
 * @author bvanchuhov
 */
public class OOPRectanglesRunner {

    public static void main(String[] args) {
        Rectangles rectangles = new Rectangles();
        rectangles.add(new Rectangle(10., 20.));
        rectangles.add(new Rectangle(5., 4.));
        rectangles.add(new Rectangle(30., 10.));
        rectangles.printAll();
        System.out.println("sumArea = " + rectangles.getSumArea());
    }
}
