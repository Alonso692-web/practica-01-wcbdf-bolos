package com.upiiz.bolos.models;

import java.time.LocalDateTime;

public class Pedido {

    private Long Id;
    private Bolo bolo;
    private LocalDateTime fecha_pedido;
    private LocalDateTime fecha_entrega;
    private String cliente;

    public Pedido(Long id, Bolo bolo, LocalDateTime fecha_pedido, LocalDateTime fecha_entrega, String cliente) {
        Id = id;
        this.bolo = bolo;
        this.fecha_pedido = fecha_pedido;
        this.fecha_entrega = fecha_entrega;
        this.cliente = cliente;
    }

    public Pedido(){

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Bolo getBolo() {
        return bolo;
    }

    public void setBolo(Bolo bolo) {
        this.bolo = bolo;
    }

    public LocalDateTime getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(LocalDateTime fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public LocalDateTime getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(LocalDateTime fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
