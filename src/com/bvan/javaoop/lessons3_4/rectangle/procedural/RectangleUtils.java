package com.bvan.javaoop.lessons3_4.rectangle.procedural;

import com.bvan.javaoop.lessons3_4.rectangle.Rectangle;
import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class RectangleUtils {

    private RectangleUtils() {}

    public static double sumArea(ArrayList<Rectangle> rectangles) {
        double sumArea = 0.;

        // READ-ONLY
        for (Rectangle rectangle : rectangles) {
            sumArea += rectangle.getArea();
        }

        return sumArea;
    }

    public static void printRectangles(ArrayList<Rectangle> rectangles) {
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
