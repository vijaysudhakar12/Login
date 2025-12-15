package com.Servlet;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Logout")
public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        HttpSession session = req.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        res.sendRedirect("login.jsp");
    }
}
