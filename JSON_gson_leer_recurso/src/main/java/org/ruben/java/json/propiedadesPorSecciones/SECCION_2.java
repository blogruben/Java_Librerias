package org.ruben.java.json.propiedadesPorSecciones;

public enum SECCION_2 {
    FORMATO_PARTE_1("formato parte 1"),
    FORMATO_PARTE_2("formato parte 2");

    private String clave;
    private String valor;
    private final String SECCION2 = "seccion_2";


    public String getClave() {
        return clave;
    }

    public String getValor() {
        return valor;
    }

    private SECCION_2(String clave) {
        this.clave = clave;
        this.valor = MapearEtiquetas.getValor(SECCION2, clave);
        
    }
}
