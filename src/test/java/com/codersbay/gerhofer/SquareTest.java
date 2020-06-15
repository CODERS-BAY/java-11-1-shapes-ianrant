package com.codersbay.gerhofer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {

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
        Square square1 = new Square(3.7);
        assertEquals(13.69, square1.getArea());

        Square square2 = new Square(5.2);
        assertEquals(30.25, square2.getArea());
    }

    @Test
    @DisplayName("")
    public void testGetPerimeter() {
        Square square3 = new Square(5.0);
        assertEquals(25, square3.getArea());

        Square square4 = new Square(2.3);
        assertEquals(5.29, square4.getArea());
    }

    @Test
    @DisplayName("Exception will be thrown when constructor has a value of 0")
    public void testConstructorThrowsException() {
        Square square5 = new Square(-1.1);
        assertThrows(IllegalArgumentException.class, square5::getArea);

        Square square6 = new Square(0d);
        assertThrows(IllegalArgumentException.class, square6::getArea);


    }


}
