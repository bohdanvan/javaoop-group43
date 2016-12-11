package com.bvan.javaoop.lessons3_4.rectangle;

/**
 * @author bvanchuhov
 */
public class RectangleRunner {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10., 20.);
        System.out.println("rectangle = " + r);
        System.out.println("width = " + r.getWidth());
        System.out.println("height = " + r.getHeight());
        System.out.println("perimeter = " + r.getPerimeter());
        System.out.println("area = " + r.getArea());
    }
}
