package com.codersbay.gerhofer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {


    @Test
    @DisplayName("")
    public void TestGetArea() {
        Shape square1 = new Square(3.7);
        assertEquals(3.7 * 3.7, square1.getArea());

        Shape square2 = new Square(5.2);
        assertEquals(5.2 * 5.2, square2.getArea());
    }

    @Test
    @DisplayName("")
    public void testGetPerimeter() {
        Shape square3 = new Square(5.0);
        assertEquals(5.0 * 5.0, square3.getArea());

        Shape square4 = new Square(2.3);
        assertEquals(2.3 * 2.3, square4.getArea());
    }

    @Test
    @DisplayName("Exception will be thrown when constructor has a value of 0")
    public void testConstructorThrowsException() {

        assertThrows(IllegalArgumentException.class, () -> {
            Shape square5 = new Square(-2.0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Shape square6 = new Square(0.0);
        });
    }


}
