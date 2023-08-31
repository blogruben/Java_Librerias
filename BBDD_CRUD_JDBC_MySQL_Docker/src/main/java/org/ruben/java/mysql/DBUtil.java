package org.ruben.java.mysql;
 
import java.sql.*;
 
public class DBUtil {

    public static void iniciarBD() {
            Connection conn = null;
            Statement stmt = null;       
            
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/hola", "root", "my-secret-pw");
            stmt = conn.createStatement();
            stmt.execute("Drop table if exists Product");
            stmt.execute("Create table Product (ProductId INT AUTO_INCREMENT PRIMARY KEY, ProductName varchar(100), Price double)");
            stmt.execute("Insert into Product(ProductName,Price) values('platanos',1.37)");
            stmt.execute("Insert into Product(ProductName,Price) values('kiwi',2.10)");
            ResultSet rs = stmt.executeQuery("select * from Product");
                System.out.print("Carga inicial " );
            while (rs.next()) {
                System.out.print(" [ ProductId-" + rs.getInt("ProductId") + 
                                "  ProductName-" + rs.getString("ProductName")+
                                "  Price-" + rs.getString("Price")+"]");
            }
            System.out.println(" ");
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public static void closeStatement(Statement s) {
        try {
            if (s != null) {
                s.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
 
    public static void closePreparedStatement(Statement ps) {
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
 
    public static void closeResultSet(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}