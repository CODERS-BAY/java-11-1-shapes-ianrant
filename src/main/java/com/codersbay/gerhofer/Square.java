package com.codersbay.gerhofer;

public class Square extends Rectangle {

    /*
        The idea is as follows:
        The class Square extends the class Rectangle.
        A square is a certain kind of rectangle (width and length are the same).
        As such Square can use the getArea() and getPerimeter() methods that Rectangle also uses.
        Hence, in the Square constructor we call the super() method which then calls the
        Rectangle constructor and hand it the sideLength variable twice to simulate length and width
     */

    public Square(Double sideLength) {
        super(sideLength, sideLength); // calls Rectangle constructor
    }


}
