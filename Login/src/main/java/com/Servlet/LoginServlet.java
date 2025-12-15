package com.Servlet;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Servlet.loginDao.LoginDao;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

        String userName = req.getParameter("uname");
        String passWord = req.getParameter("upass");

        LoginDao dao = new LoginDao();

        if (dao.check(userName, passWord)) {
            HttpSession session = req.getSession();
            session.setAttribute("UserName", userName);
            res.sendRedirect("home.jsp");
        } else {
            res.sendRedirect("login.jsp");
        }
    }
}
