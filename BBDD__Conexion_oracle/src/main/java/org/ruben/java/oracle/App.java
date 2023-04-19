package org.ruben.java.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App  {

public static void main(String[] args) {

        String conexion = "jdbc:oracle:thin:USUARIO/ESQUEMA@XXX://intranetBBDD.ejemplo.com:PUERTO/NOMBREBBDD,cn=OracleContext,ou=Databases,ou=Oracle,ou=Apps,o=ss";
        String select = "SELECT * FROM DOCUMENTO D WHERE ID=? AND NOMBRE=? AND APELLIDO=?";

        try (
            Connection oConn = DriverManager.getConnection(conexion);
            PreparedStatement oPreparedStatement = oConn.prepareStatement(select);) {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            oPreparedStatement.setString(1, "id");
            oPreparedStatement.setString(2, "nombre");
            oPreparedStatement.setString(3, "apellido");
            ResultSet oResultSet = oPreparedStatement.executeQuery();
            if (oResultSet.next())
                oResultSet.getString("DNI");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}









