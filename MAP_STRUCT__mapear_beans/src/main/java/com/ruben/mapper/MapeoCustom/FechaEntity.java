package com.ruben.mapper.MapeoCustom;

public class FechaEntity {
    private int anioNacimiento; //diferentes tipos de int a calendar
    private int mesNacimiento; 
    private int diaNacimiento;


    public FechaEntity(int anioNacimiento, int mesNacimiento, int diaNacimiento) {
        this.anioNacimiento = anioNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
    }


    public int getAnioNacimiento() {
        return anioNacimiento;
    }


    public int getMesNacimiento() {
        return mesNacimiento;
    }


    public int getDiaNacimiento() {
        return diaNacimiento;
    } 

    
}
