/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.poly.timetable;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dell
 */
public class DatabaseHelper {
    public static Connection openConnection() throws Exception{
        // Nạp driver
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        // Mở kết nối tới cơ sỏ dữ liệu
        String connectionUrl = "jdbc:sqlserver://localhost;database=DemoDB;";
        String username = "demo";
        String password = "demo";
        // Mở kết nối
        Connection con = DriverManager.getConnection(connectionUrl, username, password);
        return con;
    }
}
