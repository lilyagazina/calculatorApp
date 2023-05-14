package com.calculator.calculatorApp;

import com.calculator.calculatorApp.service.CalculatorService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParametrizedTest {
    private final CalculatorService calc = new CalculatorService();

    @ParameterizedTest
    @MethodSource("additionParamsForTests")
    public void additionParam(int expected, int num1, int num2) {
        int result = calc.addition(num1, num2);
        assertEquals(expected, result);
        int result1 = calc.addition(num1, num2);
        assertEquals(expected, result1);
    }

    public static java.util.stream.Stream<Arguments> additionParamsForTests() {
        return Stream.of(
                Arguments.of(10, 5, 5),
                Arguments.of(15, 10, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("subtractionParamsForTests")
    public void subtractionParam(int expected, int num1, int num2) {
        int result = calc.subtraction(num1, num2);
        assertEquals(expected, result);
        int result1 = calc.subtraction(num1, num2);
        assertEquals(expected, result1);
    }

    public static java.util.stream.Stream<Arguments> subtractionParamsForTests() {
        return Stream.of(
                Arguments.of(1, 6, 5),
                Arguments.of(5, 10, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("multiplicationParamsForTests")
    public void multiplicationParam(int expected, int num1, int num2) {
        int result = calc.multiplication(num1, num2);
        assertEquals(expected, result);
        int result1 = calc.multiplication(num1, num2);
        assertEquals(expected, result1);
    }

    public static java.util.stream.Stream<Arguments> multiplicationParamsForTests() {
        return Stream.of(
                Arguments.of(25, 5, 5),
                Arguments.of(50, 10, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("divisionParamsForTests")
    public void divisionParam(int expected, int num1, int num2) {
        int result = calc.division(num1, num2);
        assertEquals(expected, result);
        int result1 = calc.division(num1, num2);
        assertEquals(expected, result1);
    }

    public static java.util.stream.Stream<Arguments> divisionParamsForTests() {
        return Stream.of(
                Arguments.of(1, 5, 5),
                Arguments.of(2, 10, 5)
        );
    }
}
