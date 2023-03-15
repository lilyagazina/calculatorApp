package com.calculator.calculatorApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService service;
    public CalculatorController(CalculatorService service){
this.service=service;
    }
    @GetMapping
    public String calculator(){
        return service.calculator();
    }
    @GetMapping(path = "/calculator")
    public String greetings (){
        return service.greetings();
    }
    @GetMapping(path = "/calculator")
    public int addition(@RequestParam("plus") int num1, int num2){
        return service.addition(num1, num2);
    }
    }


