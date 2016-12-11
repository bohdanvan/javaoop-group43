package com.bvan.javaoop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class EquilateralTriangle implements Shape {

    private final double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 3 * side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * Math.pow(side, 2) / 4;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "EquilateralTriangle{" +
                "side=" + side +
                '}';
    }
}
