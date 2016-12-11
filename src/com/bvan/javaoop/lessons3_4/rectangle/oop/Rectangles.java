package com.bvan.javaoop.lessons3_4.rectangle.oop;

import com.bvan.javaoop.lessons3_4.rectangle.Rectangle;
import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class Rectangles {

    private ArrayList<Rectangle> rectangles = new ArrayList<>();

    public void add(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public double getSumArea() {
        double sumArea = 0.;

        // READ-ONLY
        for (Rectangle rectangle : rectangles) {
            sumArea += rectangle.getArea();
        }

        return sumArea;
    }

    public void printAll() {
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }

    public ArrayList<Rectangle> toList() {
        return new ArrayList<>(rectangles);
    }
}
