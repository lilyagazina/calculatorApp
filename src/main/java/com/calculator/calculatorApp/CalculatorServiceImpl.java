package com.calculator.calculatorApp;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @GetMapping
    public String calculator() {
        return "<b>calculator</b>";
    }

    public String greetings() {
        return "Добро пожаловать в калькулятор!";
    }

    public String addition(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int num3 = n1 + n2;
        return num1 + "+" + num2 + "=" + num3;
    }

    public String subtraction(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int num3 = n1 - n2;
        return num1 + "-" + num2 + "=" + num3;
    }

    public String multiplication(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int num3 = n1 * n2;
        return num1 + "*" + num2 + "=" + num3;
    }

    public String division(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        if (n1 == 0 || n2 == 0) {
            return "ERROR";
        }
        int num3 = n1 / n2;
        return num1 + "/" + num2 + "=" + num3;
    }
}
