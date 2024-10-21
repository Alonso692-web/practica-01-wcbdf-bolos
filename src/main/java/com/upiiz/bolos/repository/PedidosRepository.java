package com.upiiz.bolos.repository;

import com.upiiz.bolos.models.Pedido;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class PedidosRepository {

    List<Pedido> pedidos = new ArrayList<Pedido>();

    AtomicLong id = new AtomicLong();

    public List<Pedido> getPedidos(){
        return pedidos;
    }

    public Pedido getPedidoById(Long id){
        return pedidos.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    public Pedido guardarPedido(Pedido pedido){
        pedido.setId(id.incrementAndGet());
        pedidos.add(pedido);
        return pedido;
    }

    public void borrarPedido(Long id){
        pedidos.removeIf(p -> p.getId().equals(id));
    }

    public Pedido actualizarPedido(Pedido pedido){
        borrarPedido(pedido.getId());
        pedidos.add(pedido);
        return pedido;
    }


}
