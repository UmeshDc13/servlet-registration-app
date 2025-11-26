package com.project;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        // simple static check (later we can move to DB)
        if (user.equals("admin") && pass.equals("1234")) {
            response.getWriter().println("<h2>Login Successful ✔</h2>");
            response.getWriter().println("<p>Welcome, " + user + "!</p>");
        } else {
            response.getWriter().println("<h2>Login Failed ❌</h2>");
            response.getWriter().println("<p>Invalid username or password</p>");
        }
    }
}
