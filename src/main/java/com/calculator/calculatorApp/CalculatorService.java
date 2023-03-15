package com.calculator.calculatorApp;

import org.springframework.web.bind.annotation.GetMapping;

public interface CalculatorService {
    public String calculator();
    public String greetings ();
    public int addition(int num1, int num2);
    }

