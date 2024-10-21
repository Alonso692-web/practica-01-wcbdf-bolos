package com.upiiz.bolos.models;

public class Material {

    private Long Id;
    private String nombre;
    private Float precio;
    private Integer unidades;

    public Material(Long id, String nombre, Float precio, Integer unidades) {
        this.Id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.unidades = unidades;
    }

    public Material() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }
}
