package com.calculator.calculatorApp;

import com.calculator.calculatorApp.excption.IllegalArgumentException;
import com.calculator.calculatorApp.service.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private final CalculatorService calc = new CalculatorService();
    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int n5;


    @BeforeEach
    public void setUp() {
        n1 = 5;
        n2 = 5;
        n3 = 10;
        n4 = 5;
        n5 = 0;
    }

    @Test
    public void addition() {
        int result = calc.addition(n1, n2);
        assertEquals(10, result);
        int result1 = calc.addition(n3, n4);
        assertEquals(15, result1);
    }

    @Test
    public void subtraction() {
        int result = calc.subtraction(n1, n2);
        assertEquals(0, result);
        int result1 = calc.subtraction(n3, n4);
        assertEquals(5, result1);
    }

    @Test
    public void multiplication() {
        int result = calc.multiplication(n1, n2);
        assertEquals(25, result);
        int result1 = calc.multiplication(n3, n4);
        assertEquals(50, result1);

    }

    @Test
    public void division() {
        int result = calc.division(n1, n2);
        assertEquals(1, result);
        int result1 = calc.division(n3, n4);
        assertEquals(2, result1);
    }

    @Test
    public void divisionNotNull() {
        int result = calc.division(n3, n5);
        assertThrows(result, IllegalArgumentException.class);
    }

    private void assertThrows(int result, Class<IllegalArgumentException> illegalArgumentExceptionClass) {
    }
}