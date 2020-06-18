package com.codersbay.gerhofer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CircleTest {

    @Test
    @DisplayName("")
    public void TestGetArea() {
        Shape circle1 = new Circle(3.7);
        assertEquals(Math.PI * Math.pow(3.7, 2), circle1.getArea());

        Shape circle2 = new Circle(5.2);
        assertEquals(Math.PI * Math.pow(5.2, 2), circle2.getArea());
    }

    @Test
    @DisplayName("")
    public void testGetPerimeter() {
        Shape circle3 = new Circle(5.0);
        assertEquals(2 * Math.PI * 5.0, circle3.getPerimeter());

        Shape circle4 = new Circle(2.345);
        assertEquals(2 * Math.PI * 2.345, circle4.getPerimeter());
    }

    @Test
    @DisplayName("Exception will be thrown when constructor has a value of 0")
    public void testConstructorThrowsException() {

        assertThrows(IllegalArgumentException.class, () -> {
            Shape circle5 = new Circle(-2.0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Shape circle6 = new Circle(0.0);
        });
    }
}
