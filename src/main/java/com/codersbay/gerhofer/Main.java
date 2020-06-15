package com.codersbay.gerhofer;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello Shapes");
        //System.out.println(Math.PI);
        System.out.println("CIRCLE");
        Shape circle = new Circle(3.0);
        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The perimeter of the circle is " + circle.getPerimeter());
        System.out.println();
        System.out.println("RECTANGLE");
        Shape rectangle = new Rectangle(4.0, 2.3);
        System.out.println("The area of the rectangle is " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());
        System.out.println();
        System.out.println("SQUARE");
        Shape square = new Square(5.3);
        System.out.println("The area of the square is " + square.getArea());
        System.out.println("The perimeter of the square is " + square.getPerimeter());

    }

}
