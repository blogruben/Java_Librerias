package org.ruben.java.json.propiedadesPorSecciones;


public enum SECCION_1 {
    NOMBRE("nombre"),
    TIPO("tipo"),
    ENTORNO("entorno"),
    FORMATO("formato");

    private String clave;
    private String valor;
    private final String SECCION1 = "seccion_1";


    public String getClave() {
        return clave;
    }

    public String getValor() {
        return valor;
    }

    private SECCION_1(String clave) {
        this.clave = clave;
        this.valor = MapearEtiquetas.getValor(SECCION1, clave);
        
    }
    
}
