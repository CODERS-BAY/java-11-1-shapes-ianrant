package com.codersbay.gerhofer;

public class Circle extends Shape {

    private double radius;

    public Circle(Double radius) {
        if (radius == null || radius <= 0) {
            throw new IllegalArgumentException("Radius cannot be NULL or NEGATIVE");
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = 0;
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    //public double

    @Override
    public double getPerimeter() {
        double circumference = 0;
        circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
