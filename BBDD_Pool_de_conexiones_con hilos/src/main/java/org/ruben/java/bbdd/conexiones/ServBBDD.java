package org.ruben.java.bbdd.conexiones;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServBBDD {

    public static void cargaInicial () {
        String query = "CREATE TABLE IF NOT EXISTS DOCUMENTO (ID MEDIUMINT NOT NULL AUTO_INCREMENT ,NOMBRE_ARCHIVO varchar(255),FECHA DATETIME)";
        Connection con = PoolDeConexion.getSingleton().getConexion();
        try (PreparedStatement st = con.prepareStatement(query)) {
                st.execute();
        } catch (SQLException e) {
            System.out.println("No se ha podido creado la tabla documento: "+query+"/n");
            e.printStackTrace();
        } finally {
            PoolDeConexion.getSingleton().liberarConexion(con);
        }
    }

	public static void insertarFichero(String NOMBRE) {
        String query = "INSERT INTO DOCUMENTO (NOMBRE_ARCHIVO, FECHA ) VALUES ( ? , SYSDATE )";
        Connection con = PoolDeConexion.getSingleton().getConexion();
        try (PreparedStatement st = con.prepareStatement(query)) {
                st.setString( 1, NOMBRE );
                st.executeUpdate();
        } catch (SQLException e) {
            System.out.println("No se ha podido insertar el documento -> NOMBRE_FICHERO: "+NOMBRE+" QUERY: "+query+"/n");
            e.printStackTrace();
        } finally {
            PoolDeConexion.getSingleton().liberarConexion(con);
        }
    }

	public static void mostrarFicheros() {
        String query = "SELECT * FROM DOCUMENTO";
        Connection con = PoolDeConexion.getSingleton().getConexion();
        try (PreparedStatement st = con.prepareStatement(query)) {
                ResultSet rs = st.executeQuery();
                    while (rs.next())  {
                        int id = rs.getInt("ID");
                        String nombreFichero = rs.getString("NOMBRE_ARCHIVO");
                        Date fecha = rs.getDate("FECHA");
                        System.out.format("Documento: %s, %s, %s, \n", id, nombreFichero, fecha);
                    }
        } catch (SQLException e) {
            System.out.println("No se pueden seleccionar los documentos -> QUERY: "+query+"/n");
            e.printStackTrace();
        } finally {
            PoolDeConexion.getSingleton().liberarConexion(con);
        }
    }

	public static void abrirConexiones() {
        System.out.println("Abrir conexiones");
        PoolDeConexion.getSingleton();
    }

	public static void cerrarConexiones() {
        System.out.println("Número de conexiones: "+PoolDeConexion.getSingleton().getSize());
        PoolDeConexion.getSingleton().cerrarConexiones();
    }
	
}


	


