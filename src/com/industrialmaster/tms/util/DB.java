/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.industrialmaster.tms.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nadun Shyn
 */
public class DB {

    public static Connection getConnection() throws Exception{
        String url = "jdbc:mysql://localhost:3306/dbtms";
        String userName = "root";
        String password = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, userName, password);
        return con;
    }
}
