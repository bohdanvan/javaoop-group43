package com.bvan.javaoop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class ShapesRunner {

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.add(new Circle(10.));
        shapes.add(new Rectangle(10., 20.));
        shapes.add(new EquilateralTriangle(10.));

        System.out.println(shapes.getSumArea());
    }
}
