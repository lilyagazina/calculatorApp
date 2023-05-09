package com.calculator.calculatorApp.controller;

import com.calculator.calculatorApp.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greetings() {
        return calculatorService.greetings();
    }

    @GetMapping(path = "/plus")
    public String addition(@RequestParam(value = "num1", required = false) Integer n1,
                           @RequestParam(value = "num2", required = false) Integer n2) {
        return buildView(n1, n2, "+");
    }

    @GetMapping(path = "/minus")
    public String subtraction(@RequestParam(value = "num1", required = false) Integer n1,
                              @RequestParam(value = "num2", required = false) Integer n2) {
        return buildView(n1, n2, "-");
    }

    @GetMapping(path = "/multiply")
    public String multiplication(@RequestParam(value = "num1", required = false) Integer n1,
                                 @RequestParam(value = "num2", required = false) Integer n2) {
        return buildView(n1, n2, "*");
    }

    @GetMapping(path = "/divide")
    public String division(@RequestParam(value = "num1", required = false) Integer n1,
                           @RequestParam(value = "num2", required = false) Integer n2) {
        return buildView(n1, n2, "/");
    }

    private String buildView(Integer n1,
                             Integer n2,
                             String operation) {
        if (n1 == null || n2 == null) {
            return "ERROR1";
        }
        if ("/".equals(operation) && n2 == 0) {
            return "ERROR2";
        }
        Number result;
        switch (operation) {
            case "-":
                result = calculatorService.subtraction(n1, n2);
                break;
            case "*":
                result = calculatorService.multiplication(n1, n2);
                break;
            case "/":
                result = calculatorService.division(n1, n2);
                break;
            default:
                result = calculatorService.addition(n1, n2);
        }
        return n1 + " " + operation + " " + n2 + " = " + result;
    }
}
