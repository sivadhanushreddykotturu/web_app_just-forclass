package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorRestServlet", urlPatterns = {"/add/*", "/sub/*", "/mul/*", "/div/*"})
public class CalculatorRestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        String uri = req.getRequestURI(); // e.g. /springbootapp1/mul/2/3
        String[] parts = uri.split("/");

        try {
            // Finding operation and the two numbers in path
            String op = "";
            int a = 0;
            int b = 0;

            for (int i = 0; i < parts.length; i++) {
                if (parts[i].equalsIgnoreCase("add") || parts[i].equalsIgnoreCase("sub") 
                        || parts[i].equalsIgnoreCase("mul") || parts[i].equalsIgnoreCase("div")) {
                    op = parts[i].toLowerCase();
                    if (i + 2 < parts.length) {
                        a = Integer.parseInt(parts[i + 1]);
                        b = Integer.parseInt(parts[i + 2]);
                    }
                    break;
                }
            }

            if ("add".equals(op)) {
                out.print("<h1>Addition of two numbers are:" + (a + b) + "</h1>");
            } else if ("sub".equals(op)) {
                out.print("<h1>Subtraction of two numbers are:" + (a - b) + "</h1>");
            } else if ("mul".equals(op)) {
                out.print("<h1>Multiplication of two numbers are:" + (a * b) + "</h1>");
            } else if ("div".equals(op)) {
                if (b == 0) {
                    out.print("<h1>Division by zero is not allowed</h1>");
                } else {
                    out.print("<h1>Division of two numbers are:" + (a / b) + "</h1>");
                }
            } else {
                out.print("<h1>Invalid operation</h1>");
            }
        } catch (Exception e) {
            out.print("<h1>Error: " + e.getMessage() + "</h1>");
        }
        out.flush();
    }
}
