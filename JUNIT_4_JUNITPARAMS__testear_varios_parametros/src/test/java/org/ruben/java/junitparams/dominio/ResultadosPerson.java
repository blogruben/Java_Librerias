package org.ruben.java.junitparams.dominio;

public class ResultadosPerson {

    private Boolean esMayor;
    private String nombreCompleto;
    public ResultadosPerson(Boolean esMayor, String nombreCompleto) {
        this.esMayor = esMayor;
        this.nombreCompleto = nombreCompleto;
    }
    public Boolean getEsMayor() {
        return esMayor;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    @Override
    public String toString() {
        return "ResultadosPerson [esMayor=" + esMayor + ", nombreCompleto=" + nombreCompleto + "]";
    }

  
}