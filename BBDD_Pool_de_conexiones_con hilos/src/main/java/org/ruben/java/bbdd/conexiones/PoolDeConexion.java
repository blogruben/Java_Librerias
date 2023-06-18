package org.ruben.java.bbdd.conexiones;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PoolDeConexion { 

    private String url, user, pass;
    private volatile List<Connection> connectionPool;
    private volatile List<Connection> usedConnections = new ArrayList<>();
    private static int INITIAL_POOL_SIZE = 1;
    private static int MAX_POOL_SIZE = 6;
    //Chequea que la conexion esta activa por un máximo de segundos.
    private static int MAX_TIMEOUT = 4;
	private static volatile PoolDeConexion instanceOracle;
	private static Object cerrojo = new Object();

	static PoolDeConexion getSingleton() {
		PoolDeConexion result = instanceOracle;
		if (result == null) {
			synchronized (cerrojo) {
				result = instanceOracle;
				if (result == null)  {
                        //podemos implementar diferente bbdd oracle mysql dependiendo de propiedad de entorno
                        //instanceOracle = result = new PoolDeConexion("jdbc:oracle:thin:@localhost:1521:orcl", "system", "123"); 
                        instanceOracle = result = new PoolDeConexion("jdbc:h2:~/test", "", ""); 
                }
			}
		}
		return result;
	}

    private PoolDeConexion(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.pass = password;
        List<Connection> pool = new ArrayList<>(INITIAL_POOL_SIZE);
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            pool.add(createConnection(url,user,pass));
        }
        this.connectionPool = pool;

    }
    
    synchronized Connection getConexion() {
        if (connectionPool.isEmpty()) {
            if (usedConnections.size() < MAX_POOL_SIZE) {
                connectionPool.add(createConnection(url,user,pass));
            } else {
                throw new RuntimeException(
                  "Hemos alcanzado el máximo de conexiones, no hay más conexiones disponibles!");
            }
        }
    
        Connection connection = connectionPool
          .remove(connectionPool.size() - 1);
    
        try {
            if(!connection.isValid(MAX_TIMEOUT)){
                connection = createConnection(url,user,pass);
            }
        } catch (SQLException e) {
            throw new RuntimeException(
                "Error al comprobar si la conexion "+url+" sigue activa, el tiempo maximo para ello es de "+MAX_TIMEOUT);
        }
    
        usedConnections.add(connection);
        return connection;
    }
    
    synchronized boolean liberarConexion(Connection connection) {
        connectionPool.add(connection);
        return usedConnections.remove(connection);
    }
    
    private static Connection createConnection(String url, String user, String password) {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(
                  String.format("Error a conectar con la url : %s user : %s pass: %s",url,user,password));
        }
    }
    
    synchronized int getSize() {
        return connectionPool.size() + usedConnections.size();
    }

    synchronized void cerrarConexiones() {
        usedConnections.forEach(this::liberarConexion);
        for (Connection c : connectionPool) {
            try {
                if(c !=null) c.close();
            } catch (SQLException e) {
                throw new RuntimeException("Error al cerrar la conexion ");
            }
        }
        connectionPool.clear();
    }

    @Override
    public String toString() {
        return "PoolDeConexion [url=" + url + ", user=" + user + ", pass=" + pass + "connectionPool=" + connectionPool.size() +"]";
    }

}