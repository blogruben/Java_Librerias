package org.ruben.java.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    // assumes the current class is called MyLogger
    private final static Logger logger = LoggerFactory.getLogger(App.class.getName());
    private final static Logger loggerTareaINFO = LoggerFactory.getLogger("org.ruben.java.logback.tarea");
    private final static Logger loggerSubtareaWARN = LoggerFactory.getLogger("com.baeldung.logback.tarea.subtarea");

    public static void main(String[] args) {
        //Variables en las trazas
        String userName = "Ruben";          
        logger.info("Hola {}", userName);
        logger.info("Esta clase se llama: {}", App.class.getSimpleName());

        //filtrar
        //en el root logger esta en debug
        logger.trace("No se muestra TRACE < INFO");

        //podemos filtra niveles por paquete
        //niveles TRACE, DEBUG, INFO, WARN y ERROR
        //en logback.xml ponemos este paquete a nivel de INFO
        loggerTareaINFO.trace("1. No vemos - TRACE < INFO.");
        loggerTareaINFO.debug("2. No vemos - DEBUG < INFO.");
        loggerTareaINFO.info("3. Si vemos - INFO = INFO.");
        loggerTareaINFO.warn("4. Si vemos - WARN > INFO.");
        loggerTareaINFO.error("5. Si vemos - ERROR > INFO.");
        //en logback.xml ponemos este paquete a nivel de WARN
        loggerSubtareaWARN.trace("1. No vemos - TRACE < WARN.");
        loggerSubtareaWARN.debug("2. No vemos - DEBUG < WARN.");
        loggerSubtareaWARN.info("3. No vemos - INFO < WARN.");
        loggerSubtareaWARN.warn("4. Si vemos - WARN = WARN.");
        loggerSubtareaWARN.error("5. Si vemos - ERROR > WARN.");

    }
}
