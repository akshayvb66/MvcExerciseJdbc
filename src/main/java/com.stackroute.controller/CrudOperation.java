package com.stackroute.controller;

import java.sql.*;
import java.sql.Connection;

public class CrudOperation {
    private Connection con;

    public void displayData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "akshay", "password");
            Statement stm = con.createStatement();

            ResultSet rs = stm.executeQuery("select * from users");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void insertUser(String username,String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "akshay", "password");

            PreparedStatement stmt2= con.prepareStatement("insert into users values(?,?)");

            stmt2.setString(1,username);
            stmt2.setString(2,password);

            stmt2.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}