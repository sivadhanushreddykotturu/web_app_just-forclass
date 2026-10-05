package com.example;

import com.example.controller.CalculatorController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorControllerTest {

    private final CalculatorController controller = new CalculatorController();

    @Test
    void testAdd() {
        String result = controller.add(2, 3);
        assertEquals("Addition of two numbers are:5", result);
    }
}
