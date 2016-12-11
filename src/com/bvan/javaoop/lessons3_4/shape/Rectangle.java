package com.bvan.javaoop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class Rectangle implements Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        checkSize(width);
        checkSize(height);

        this.width = width;
        this.height = height;
    }

    private void checkSize(double size) {
        if (size <= 0) {
            throw new IllegalArgumentException("not positive size: " + size);
        }
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
