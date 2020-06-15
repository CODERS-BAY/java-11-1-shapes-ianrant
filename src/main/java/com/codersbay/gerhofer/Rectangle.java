package com.codersbay.gerhofer;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(Double length, Double width) {

        if (length == null || length <= 0 || width == null || width <= 0) {
            throw new IllegalArgumentException("The values for length and/or width cannot be NULL, ZERO or NEGATIVE");
        }

        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        double area = 0;
        area = length * width;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 0;
        perimeter = (2 * width) + (2 * length);
        return 0;
    }
}
