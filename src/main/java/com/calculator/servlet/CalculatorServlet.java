package com.calculator.servlet;

import com.calculator.service.CalculatorService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "CalculatorServlet", urlPatterns = {"/calculate"})
public class CalculatorServlet extends HttpServlet {

    private final CalculatorService calculatorService = new CalculatorService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1Str = req.getParameter("num1");
        String num2Str = req.getParameter("num2");
        String operation = req.getParameter("operation");

        try {
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);
            double result = 0.0;

            if ("add".equalsIgnoreCase(operation)) {
                result = calculatorService.add(num1, num2);
            } else if ("subtract".equalsIgnoreCase(operation)) {
                result = calculatorService.subtract(num1, num2);
            } else if ("multiply".equalsIgnoreCase(operation)) {
                result = calculatorService.multiply(num1, num2);
            } else if ("divide".equalsIgnoreCase(operation)) {
                result = calculatorService.divide(num1, num2);
            }

            req.setAttribute("num1", num1);
            req.setAttribute("num2", num2);
            req.setAttribute("operation", operation);
            req.setAttribute("result", result);
            req.setAttribute("hasResult", true);
        } catch (Exception e) {
            req.setAttribute("error", "Invalid input or calculation error: " + e.getMessage());
        }

        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
