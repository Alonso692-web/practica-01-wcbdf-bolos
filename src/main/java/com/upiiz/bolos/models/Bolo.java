package com.upiiz.bolos.models;

public class Bolo {
    private Long Id;
    private String modelo;
    private Float precio;
    private Insumo insumos;

    public Bolo(Long id, String modelo, Float precio, Insumo insumos) {
        Id = id;
        this.modelo = modelo;
        this.precio = precio;
        this.insumos = insumos;
    }

    public Bolo(){

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Insumo getInsumos() {
        return insumos;
    }

    public void setInsumos(Insumo insumos) {
        this.insumos = insumos;
    }
}
