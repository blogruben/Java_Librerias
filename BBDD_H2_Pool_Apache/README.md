#BBDD H2 POOL

Ver como se crean destruyen las conexiones. 
Con el pool de Apache cuando pedimos una conexion,
te devuelve una que pasa de estado idle a active
Cuando se cierra la conexion se pasa a estado idle.
Si se pide una conexion y no hay ninguna en estado idle, se crea una conexion (costoso)
Si se quieres destruir todas las conexiones, llamamos BasicDataSource.close()