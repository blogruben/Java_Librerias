package org.ruben.java.h2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App  {

public static void main(String[] args) throws ClassNotFoundException, SQLException  {
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "", "");
        //Connection conn = DriverManager.getConnection("jdbc:h2:user/password@localhost/test");
        Statement stmt = conn.createStatement();
        stmt.execute("drop table user if exists");
        stmt.execute("create table user(id int primary key, name varchar(100))");
        stmt.execute("insert into user values(1, 'hello')");
        stmt.execute("insert into user values(2, 'world')");
        ResultSet rs = stmt.executeQuery("select * from user");
 
        while (rs.next()) {
            System.out.println("id " + rs.getInt("id") + " name " + rs.getString("name"));
        }
        stmt.close();
    }

        //id 1 name hello
        //id 2 name world

}











