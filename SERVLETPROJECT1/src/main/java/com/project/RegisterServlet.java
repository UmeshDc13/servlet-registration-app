package com.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public RegisterServlet() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name     = request.getParameter("fullname");
        String email    = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try (Connection conn = DBConnection.getConnection()) {

            String sql = "INSERT INTO users(fullname, email, username, password) VALUES(?,?,?,?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, username);
                ps.setString(4, password);

                int rows = ps.executeUpdate();

                if (rows > 0) {
                    out.println("<h2>Registration Successful ✔</h2>");
                    out.println("<p>Welcome, " + name + "!</p>");
                } else {
                    out.println("<h2>Registration Failed ❌</h2>");
                }
            }

        } catch (Exception e) {
            out.println("<h2>Error while registering user ❌</h2>");
            out.println("<p>" + e.getMessage() + "</p>");
            e.printStackTrace();
        }
    }
}
