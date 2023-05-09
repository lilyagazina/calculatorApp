package com.calculator.calculatorApp.service;

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

    public String buildView(Integer n1,
                            Integer n2,
                            String operation) {
        if (n1 == null || n2 == null) {
            throw new IllegalArgumentException();
        }
        if ("/".equals(operation) && n2 == 0) {
            throw new IllegalArgumentException();
        }
        Number result;
        switch (operation) {
            case "-":
                result = subtraction(n1, n2);
                break;
            case "*":
                result = multiplication(n1, n2);
                break;
            case "/":
                result = division(n1, n2);
                break;
            default:
                result = addition(n1, n2);
        }
        return n1 + " " + operation + " " + n2 + " = " + result;
    }
}
