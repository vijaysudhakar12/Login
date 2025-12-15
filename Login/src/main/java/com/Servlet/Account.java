package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Servlet.loginDao.LoginDao;

@WebServlet("/AccountServlet")
public class AccountServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String userName = req.getParameter("uname");
        String passWord = req.getParameter("upass");

        LoginDao dao = new LoginDao();
        dao.Insert(userName, passWord);

        res.sendRedirect("login.jsp");
    }
}
