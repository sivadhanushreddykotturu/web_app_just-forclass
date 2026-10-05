package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/add/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b) {
        return "Addition of two numbers are:" + (a + b);
    }

    @GetMapping("/sub/{a}/{b}")
    public String sub(@PathVariable int a, @PathVariable int b) {
        return "Subtraction of two numbers are:" + (a - b);
    }

    @GetMapping("/mul/{a}/{b}")
    public String mul(@PathVariable int a, @PathVariable int b) {
        return "Multiplication of two numbers are:" + (a * b);
    }

    @GetMapping("/div/{a}/{b}")
    public String div(@PathVariable int a, @PathVariable int b) {
        if (b == 0) return "Division by zero is not allowed";
        return "Division of two numbers are:" + (a / b);
    }
}
