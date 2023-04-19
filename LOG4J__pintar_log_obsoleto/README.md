
# Proyecto pinta_log_usando_log4j_obsoleto

# (NO USAR, TIENE VULNERABILIDAD)

Esta es una practica de log4j, no debemos usar esta libreria 
(log4j tiene importantes vulnerabilidades y no tiene soporte) sustituir por:
- [LogBack](https://logback.qos.ch/manual/index.html)
- [Log4j2](https://logging.apache.org/log4j/2.x/), esta en [mvn](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j)
- [Apache Commons Log](https://commons.apache.org/proper/commons-logging/)

Usando un facade slf4j para abstraer la implementacion

Log4J distingue entre:
- loggers: Son responsables de generar mensajes
- appenders: Envian esos mensajes a algún lugar (un archivo, la consola, una base de datos, ...)
