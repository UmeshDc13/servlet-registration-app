package com.project;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AdditionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AdditionServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");

        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        int result = num1 + num2;

        response.getWriter().println("<h2>GET Result = " + result + "</h2>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");

        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        int result = num1 + num2;

        response.getWriter().println("<h2>POST Result = " + result + "</h2>");
    }
}
