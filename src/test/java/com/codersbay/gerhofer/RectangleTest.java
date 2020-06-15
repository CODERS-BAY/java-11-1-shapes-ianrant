package com.codersbay.gerhofer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {

    /*

    Am besten wäre es, wenn du für jede konkrete, instanzierbare (=nicht abstrakt) Klasse,
    also Circle, Rectangle und Square eine Testklasse erzeugst
    und die Umfangs- und Flächenberechnung für 2 verschiedene Beispiele pro Klasse testet.
    Schreibe außerdem Tests, welche verifizieren dass bei Übergabe einer negativen Zahl
    oder null eine IllegalArgumentException geworfen wird.



     */

    @Test
    @DisplayName("")
    public void TestGetArea() {
        Shape rectangle1 = new Rectangle(3.7, 2.5);
        assertEquals(9.25, rectangle1.getArea());

        Shape rectangle2 = new Rectangle(5.2, 4.4);
        assertEquals(22.88, rectangle2.getArea());
    }

    @Test
    @DisplayName("")
    public void testGetPerimeter() {
        Shape rectangle3 = new Rectangle(5.0, 2.1);
        assertEquals(10.5, rectangle3.getArea());

        Shape rectangle4 = new Rectangle(2.3, 2.9);
        assertEquals(6.67, rectangle4.getArea());
    }

    @Test
    @DisplayName("Exception will be thrown when constructor has a value of 0")
    public void testConstructorThrowsException() {
        Shape rectangle5 = new Rectangle(-1.1, 2.1);
        assertThrows(IllegalArgumentException.class, rectangle5::getArea);

        Shape rectangle6 = new Rectangle(10.1, 0d);
        assertThrows(IllegalArgumentException.class, rectangle6::getArea);
    }


}
