package com.codersbay.gerhofer;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(Double length, Double width) {
        if (length != null && width != null && length > 0 && width > 0) {
            this.length = length;
            this.width = width;
        } else {
            throw new IllegalArgumentException("The values for length and/or width cannot be NULL, ZERO or NEGATIVE");
        }
    }

    @Override
    public double getArea() {
        double area = length * width;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = (2 * width) + (2 * length);
        return perimeter;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
