package com.calculator;

import com.calculator.service.CalculatorService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    @Test
    void testAddition() {
        CalculatorService calc = new CalculatorService();
        assertEquals(15.0, calc.add(10.0, 5.0), "10 + 5 should equal 15");
        assertEquals(0.0, calc.add(-5.0, 5.0), "-5 + 5 should equal 0");
    }

    @Test
    void testSubtraction() {
        CalculatorService calc = new CalculatorService();
        assertEquals(5.0, calc.subtract(10.0, 5.0), "10 - 5 should equal 5");
        assertEquals(-10.0, calc.subtract(-5.0, 5.0), "-5 - 5 should equal -10");
    }
}
