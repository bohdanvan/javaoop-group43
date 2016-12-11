package com.bvan.javaoop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class PolymorphicShapeRunner {

    public static void main(String[] args) {
        useShape(new Rectangle(10., 20.));
    }

    public static void useShape(Shape shape) {
        System.out.println("area = " + shape.getArea());
        System.out.println("perimeter = " + shape.getPerimeter());
    }
}
