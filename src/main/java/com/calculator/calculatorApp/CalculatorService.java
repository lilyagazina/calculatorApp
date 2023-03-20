package com.calculator.calculatorApp;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class CalculatorService {
    @GetMapping
    public String calculator() {
        return "<b>calculator</b>";
    }

    public String greetings() {
        return "Добро пожаловать в калькулятор!";
    }

    public int addition(int n1, int n2) {
        return n1 + n2;
    }

    public int subtraction(int n1, int n2) {
        return n1 - n2;
    }

    public int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    public int division(int n1, int n2) {
        return n1 / n2;
    }
}
