package com.codersbay.gerhofer;

public class Square extends Shape {

    private double length;

    public Square(Double length) {
        if (length == null || length <= 0) {
            throw new IllegalArgumentException("The values for length cannot be NULL, ZERO or NEGATIVE");
        }
        this.length = length;
    }

    @Override
    public double getArea() {
        double area = 0;
        area = length * length;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 0;
        perimeter = 4 * length;
        return 0;
    }
}
