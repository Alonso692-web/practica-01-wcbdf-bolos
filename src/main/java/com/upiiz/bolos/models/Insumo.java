package com.upiiz.bolos.models;

public class Insumo {
    private Long Id;
    private String nombre_insumo;
    private String tipo;
    private Integer cantidad_por_paquete;
    private Integer precio;

    public Insumo(Long id, String nombre_insumo, String tipo, Integer cantidad_por_paquete, Integer precio) {
        Id = id;
        this.nombre_insumo = nombre_insumo;
        this.tipo = tipo;
        this.cantidad_por_paquete = cantidad_por_paquete;
        this.precio = precio;
    }

    public Insumo(){

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre_insumo() {
        return nombre_insumo;
    }

    public void setNombre_insumo(String nombre_insumo) {
        this.nombre_insumo = nombre_insumo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCantidad_por_paquete() {
        return cantidad_por_paquete;
    }

    public void setCantidad_por_paquete(Integer cantidad_por_paquete) {
        this.cantidad_por_paquete = cantidad_por_paquete;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}
