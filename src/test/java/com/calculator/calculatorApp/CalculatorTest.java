package com.calculator.calculatorApp;

import com.calculator.calculatorApp.service.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private CalculatorService calculator;
    private int n1;
    private int n2;
    private int sum;

//    @BeforeEach
//    public void setUp() {
//        n1 = 5;
//        n2 = 5;
//        sum = n1 + n2;
//    }

    @Test
    public void addition() {
        n1 = 5;
        n2 = 5;
        sum = n1 + n2;
        calculator.addition(n1, n2);
        assertEquals(sum, calculator);
    }

   /* @Test
    public int subtraction() {
    }
    @Test
    public int multiplication() {

    }
    @Test
    public int division() {

    }
}*/
}