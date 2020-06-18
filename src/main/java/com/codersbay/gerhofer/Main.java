package com.codersbay.gerhofer;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello Shapes");
        //System.out.println(Math.PI);

        String shapeIsFilled = "";

        out.println("A CIRCLE");
        Shape circle = new Circle(3.12);
        circle.setColor("Red");
        circle.setFilled(true);
        shapeIsFilled = circle.isFilled() != false ? "filled" : "not filled";
        Double circleRadius = ((Circle) circle).getRadius();
        out.println("The circle has a radius of " + circleRadius +
                "\nan area of " + circle.getArea() +
                ",\nits perimeter is " + circle.getPerimeter() +
                ",\nit bears the lovely color " + circle.getColor() +
                " \nand it is " + shapeIsFilled + ".\n\n"
        );

        out.println("RECTANGLE");
        Shape rectangle = new Rectangle(4.0, 2.3);
        rectangle.setColor("Blue");
        rectangle.setFilled(false);
        shapeIsFilled = rectangle.isFilled() != false ? "filled" : "not filled";
        Double rectangleWidth = ((Rectangle) rectangle).getWidth();
        Double rectangleLength = ((Rectangle) rectangle).getLength();
        out.println("The rectangle has a length of " + rectangleLength +
                ",\na width of " + rectangleWidth +
                ",\nan area of " + rectangle.getArea() +
                ",\nits perimeter is " + rectangle.getPerimeter() +
                ",\nit bears the lovely color " + rectangle.getColor() +
                " \nand it is " + shapeIsFilled + ".\n\n"
        );

        out.println("SQUARE");
        Shape square = new Square(5.3);
        square.setColor("Yellow");
        square.setFilled(true);
        shapeIsFilled = square.isFilled() != false ? "filled" : "not filled";
        Double squareLength = ((Square) square).getLength();
        out.println("The rectangle has a length of " + squareLength +
                ",\nan area of " + square.getArea() +
                ",\nits perimeter is " + square.getPerimeter() +
                ",\nit bears the lovely color " + square.getColor() +
                " \nand it is " + shapeIsFilled + ".\n\n"
        );
    }

}
