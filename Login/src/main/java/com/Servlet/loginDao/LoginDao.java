package com.Servlet.loginDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

    private static final String DB_URL = "jdbc:mysql://localhost:3305/muledb";
    private static final String USER = "root";
    private static final String PASS = "Vijaysudhakar@12";

    private Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public boolean check(String uname, String pass) {
        String sql = "SELECT * FROM login WHERE uname=? AND password=?";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, uname);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();
            return rs.next();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void insert(String uname, String pass) {
        String sql = "INSERT INTO login(uname,password) VALUES(?,?)";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, uname);
            ps.setString(2, pass);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
