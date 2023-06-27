package org.ruben.java.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.commons.dbcp.BasicDataSource;

public class App {

    public static void main(String[] args) throws SQLException {

        BasicDataSource ds = new BasicDataSource();
        ds.setUrl("jdbc:h2:mem:test");
        ds.setUsername("user");
        ds.setPassword("password");
        ds.setMinIdle(5);
        ds.setMaxIdle(10);
        ds.setMaxOpenPreparedStatements(100);

        System.out.println("1. Idle:" + ds.getNumIdle() + " Active:" + ds.getNumActive());

        Connection conn1 = ds.getConnection(); //si existen conexiones libres las ponemos en active, sino creamos una (tarea pesada)
        Connection conn2 = ds.getConnection();
        System.out.println("2. Idle:" + ds.getNumIdle() + " Active:" + ds.getNumActive());

        conn1.close();                               // ponemos en estado idle
        conn2.close();
        System.out.println("3. Idle:" + ds.getNumIdle() + " Active:" + ds.getNumActive());

        Connection conn3 = ds.getConnection();
        System.out.println("4. Idle:" + ds.getNumIdle() + " Active:" + ds.getNumActive());

        conn3.close();
        ds.close();//destruye conexion costoso
        System.out.println("5. Idle:" + ds.getNumIdle() + " Active:" + ds.getNumActive());

    }

}
