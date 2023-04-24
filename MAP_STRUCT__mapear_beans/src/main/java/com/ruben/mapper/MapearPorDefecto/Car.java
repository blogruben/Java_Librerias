package com.ruben.mapper.MapearPorDefecto;

import java.util.GregorianCalendar;

public class Car {
    private String id;
    private String brand;
    private int numbreDoors;
    private double price;
    private String descripcion;
    private GregorianCalendar manufacturingDate;
    
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getNumbreDoors() {
        return numbreDoors;
    }
    public void setNumbreDoors(int numbreDoors) {
        this.numbreDoors = numbreDoors;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public GregorianCalendar getManufacturingDate() {
        return manufacturingDate;
    }
    public void setManufacturingDate(GregorianCalendar manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }



    
}
