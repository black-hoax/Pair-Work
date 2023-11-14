package com.vamk.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AddNumbersServlet")
public class BasicservletAssignment extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get parameters from the request
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));

        // Calculate the sum
        int sum = num1 + num2;

        // Set the response content type
        response.setContentType("text/html");

        // Write the result to the response
        response.getWriter().println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
