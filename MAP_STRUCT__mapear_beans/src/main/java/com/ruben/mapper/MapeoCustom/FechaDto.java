package com.ruben.mapper.MapeoCustom;

import java.util.Date;

public class FechaDto {
    private Date fecha; //diferentes tipos de int a calendar

    public Date getFecha() {
        return (Date) fecha.clone();
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
}
