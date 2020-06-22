package com.codersbay.gerhofer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {

    @Test
    public void testGetArea() {
        Shape rectangle1 = new Rectangle(3.7, 2.5);
        assertEquals(3.7 * 2.5, rectangle1.getArea());

        Shape rectangle2 = new Rectangle(5.2, 4.4);
        assertEquals(5.2 * 4.4, rectangle2.getArea());
    }

    @Test
    public void testGetPerimeter() {
        Shape rectangle3 = new Rectangle(5.0, 2.1);
        assertEquals((2 * 5.0 + 2 * 2.1), rectangle3.getPerimeter());

        Shape rectangle4 = new Rectangle(2.3, 2.9);
        assertEquals((2 * 2.3 + 2 * 2.9), rectangle4.getPerimeter());
    }

    @Test
    public void testConstructorThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Rectangle r = new Rectangle(-2.0, -2.0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Rectangle r = new Rectangle(0.0, 0.0);
        });

    }
}
