package com.codersbay.gerhofer;

public abstract class Shape {

    private String color;
    private boolean isFilled;

    public abstract double getArea(); // returns the area of the shape

    public abstract double getPerimeter(); // returns the perimter of the shape

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }
}
