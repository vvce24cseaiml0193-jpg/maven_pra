package maaven.maaven;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void testValidAreaStandardValues() {
        // Base = 10.0, Height = 5.0 -> Area = 25.0
        assertEquals(25.0, Triangle.calculateArea(10.0, 5.0), 0.001);
    }

    @Test
    void testValidAreaDecimalValues() {
        // Base = 3.0, Height = 5.0 -> Area = 7.5
        assertEquals(7.5, Triangle.calculateArea(3.0, 5.0), 0.001);
    }

    @Test
    void testInvalidZeroOrNegativeBase() {
        // Test base <= 0 throws IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> Triangle.calculateArea(0, 10));
        assertThrows(IllegalArgumentException.class, () -> Triangle.calculateArea(-5, 10));
    }

    @Test
    void testInvalidZeroOrNegativeHeight() {
        // Test height <= 0 throws IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> Triangle.calculateArea(10, 0));
        assertThrows(IllegalArgumentException.class, () -> Triangle.calculateArea(10, -5));
    }
}