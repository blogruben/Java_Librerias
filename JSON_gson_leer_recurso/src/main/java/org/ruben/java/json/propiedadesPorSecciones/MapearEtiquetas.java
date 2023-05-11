package org.ruben.java.json.propiedadesPorSecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;//Gson es compatible
import com.google.gson.JsonSyntaxException;

public class MapearEtiquetas {

    private JsonObject jsonObject;
    private final String archivoJSON = "/mapeoEtiquetas.json";
    //public static SECCION_1 SECCION1;
    private static MapearEtiquetas INSTANCE = null;



    private MapearEtiquetas() {
        jsonObject = leerArchivoJSON();
    }

    //leer una seccion de JsonObject
    static String getValor(String seccion,String clave )  {
        return getInstance().jsonObject.get(seccion)
                      .getAsJsonObject().get(clave)
                      .getAsString();   
    }

    private static MapearEtiquetas getInstance() {
        if (INSTANCE == null) {
            synchronized (MapearEtiquetas.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MapearEtiquetas();
                }
            }
        }
        return INSTANCE;
    }

    // leemos el archivo json y lo guardamos en la propiedad JsonObject de la clase
    private JsonObject leerArchivoJSON() {
        JsonElement root;
        try {
            root = new JsonParser().parse(leerFicheroPropiedades(archivoJSON));
        } catch (JsonSyntaxException e) {
            throw new RuntimeException("Error en el parseo del Json ",e);
        } catch (IOException e) {
            throw new RuntimeException("Error al leer el fichero mapeoEtiquetas.json ",e);
        }
        return root.getAsJsonObject().getAsJsonObject();
    }

    // leer fichero de propiedades que se encuentra en el directorio raiz del jar
    // Devolvemos String con el contenido
    private String leerFicheroPropiedades(String nombreFicheroRecurso) throws IOException {
        URL url = this.getClass().getResource(nombreFicheroRecurso);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        String ls = System.getProperty("line.separator");
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }
        // delete the last new line separator
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        reader.close();
        return stringBuilder.toString();
    }
}
