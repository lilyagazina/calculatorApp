package com.calculator.calculatorApp;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @GetMapping
    public String calculator(){
        return "<b>calculator</b>";
    }

    public String greetings (){
        return "Добро пожаловать в калькулятор!";
    }
    public int addition(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
}
