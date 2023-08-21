package org.ruben.java.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App  {

public static void main(String[] args) throws ClassNotFoundException, SQLException  {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/hola", "root", "my-secret-pw");
        Statement stmt = conn.createStatement();
        stmt.execute("drop table if exists user");
        stmt.execute("create table user(id int primary key, name varchar(100))");
        stmt.execute("insert into user values(1, 'hello')");
        stmt.execute("insert into user values(2, 'world')");
        ResultSet rs = stmt.executeQuery("select * from user");
 
        while (rs.next()) {
            System.out.println("id " + rs.getInt("id") + " name " + rs.getString("name"));
        }
        stmt.close();
    }

}











