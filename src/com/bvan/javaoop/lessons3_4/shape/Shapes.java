package com.bvan.javaoop.lessons3_4.shape;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Shapes {

    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public double getSumArea() {
        double sumArea = 0.;

        for (Shape shape : shapes) {
            sumArea += shape.getArea();
        }

        return sumArea;
    }
}
