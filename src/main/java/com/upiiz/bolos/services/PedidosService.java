package com.upiiz.bolos.services;

import com.upiiz.bolos.models.Pedido;
import com.upiiz.bolos.repository.PedidosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidosService {

    PedidosRepository pedidosRepository;

    public PedidosService(PedidosRepository pedidosRepository) {
        this.pedidosRepository = pedidosRepository;
    }

    public List<Pedido> getPedidos(){
        return pedidosRepository.getPedidos();
    }

    public Pedido getPedidosById(Long id){
        return pedidosRepository.getPedidoById(id);
    }

    public Pedido createPedido(Pedido pedido) {
        return pedidosRepository.guardarPedido(pedido);
    }

    public void deletePedido(Long id) {
        pedidosRepository.borrarPedido(id);
    }

    public Pedido updatePedido(Pedido pedido) {
        return pedidosRepository.actualizarPedido(pedido);
    }

}
