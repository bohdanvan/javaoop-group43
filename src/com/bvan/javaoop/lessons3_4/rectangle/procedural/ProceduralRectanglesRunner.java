package com.bvan.javaoop.lessons3_4.rectangle.procedural;

import com.bvan.javaoop.lessons3_4.rectangle.Rectangle;
import static com.bvan.javaoop.lessons3_4.rectangle.procedural.RectangleUtils.printRectangles;
import static com.bvan.javaoop.lessons3_4.rectangle.procedural.RectangleUtils.sumArea;
import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ProceduralRectanglesRunner {

    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(10., 20.));
        rectangles.add(new Rectangle(5., 4.));
        rectangles.add(new Rectangle(30., 10.));
        printRectangles(rectangles);

        double sumArea = sumArea(rectangles);
        System.out.println("sumArea = " + sumArea);
    }
}
