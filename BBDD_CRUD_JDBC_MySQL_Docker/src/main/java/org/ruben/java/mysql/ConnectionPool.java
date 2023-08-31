package org.ruben.java.mysql;
 
import java.sql.*;
 
public class ConnectionPool {

 
    public static Connection getConnection() {
        try {
            return  DriverManager.getConnection("jdbc:mysql://localhost:3307/hola", "root", "my-secret-pw");

        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
 
    public static void freeConnection(Connection c) {
        try {
            c.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}