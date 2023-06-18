package org.ruben.java.bbdd;

import java.util.Calendar;
import org.ruben.java.bbdd.conexiones.ServBBDD;
import org.ruben.java.bbdd.hilos.ServHilos;

public class App implements Runnable  {

    public static void main(String[] args)   {
        //Ver los tiempos de ejecutarlos con hilos y sin ellos
        //  1 hilos 8000 registros tarda  17,7segundos
        //  4 hilos 8000 registros tarda  6,7 segundos
        ServBBDD.abrirConexiones();
        ServBBDD.cargaInicial();
        
        
        long inicio = Calendar.getInstance().getTimeInMillis();
        ServHilos.iniciarHilosApp(4);
        long duracion = Calendar.getInstance().getTimeInMillis() - inicio;
        System.out.println("Duracion: "+duracion);

        ServBBDD.mostrarFicheros();

        ServBBDD.cerrarConexiones();
        System.out.println("Fin");
    }

    @Override
    public void run() {
        System.out.println("Incio "+Thread.currentThread().getName());
        ejecutarQuery(20);
    }

    private static void ejecutarQuery(int veces){
        String hilo = Thread.currentThread().getName();
        String nombreArchivo = "_"+hilo+".txt";
        for (int i = 0; i < veces; i++) {
            ServBBDD.insertarFichero(i+nombreArchivo);
        }
    }

}









