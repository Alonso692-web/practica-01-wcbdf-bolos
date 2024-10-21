package com.upiiz.bolos.models;

import java.time.LocalDateTime;

public class Almacen {
    private Long id;
    private Integer cantidad;
    private LocalDateTime fecha;

    public Almacen(Integer cantidad, LocalDateTime fecha) {
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public Almacen() {

    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
}
