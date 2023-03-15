package com.calculator.calculatorApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping
    public String greetings() {
        return service.greetings();
    }

    @GetMapping(path = "/plus")
    public String addition(@RequestParam(required = false) String num1,
                           @RequestParam(required = false) String num2) {
        return service.addition(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String subtraction(@RequestParam(required = false) String num1,
                              @RequestParam(required = false) String num2) {
        return service.subtraction(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiplication(@RequestParam(required = false) String num1,
                                 @RequestParam(required = false) String num2) {
        return service.multiplication(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String division(@RequestParam(required = false) String num1,
                           @RequestParam(required = false) String num2) {
        return service.division(num1, num2);
    }
}
