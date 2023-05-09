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
        return calculatorService.buildView(n1, n2, "+");
    }

    @GetMapping(path = "/minus")
    public String subtraction(@RequestParam(value = "num1", required = false) Integer n1,
                              @RequestParam(value = "num2", required = false) Integer n2) {
        return calculatorService.buildView(n1, n2, "-");
    }

    @GetMapping(path = "/multiply")
    public String multiplication(@RequestParam(value = "num1", required = false) Integer n1,
                                 @RequestParam(value = "num2", required = false) Integer n2) {
        return calculatorService.buildView(n1, n2, "*");
    }

    @GetMapping(path = "/divide")
    public String division(@RequestParam(value = "num1", required = false) Integer n1,
                           @RequestParam(value = "num2", required = false) Integer n2) {
        return calculatorService.buildView(n1, n2, "/");
    }

}
