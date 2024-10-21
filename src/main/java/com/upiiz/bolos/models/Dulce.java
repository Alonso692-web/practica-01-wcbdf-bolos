package com.upiiz.bolos.models;

public class Dulce {

    private Long id;
    private String nombre;
    private Float precio;
    private Integer piezas;

    public Dulce(){

    }

    public Dulce(Long id, String nombre, Float precio, Integer piezas) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.piezas = piezas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getPiezas() {
        return piezas;
    }

    public void setPiezas(Integer piezas) {
        this.piezas = piezas;
    }
}
