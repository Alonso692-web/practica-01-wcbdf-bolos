package com.upiiz.bolos.controllers;

import com.upiiz.bolos.models.Pedido;
import com.upiiz.bolos.services.PedidosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/pedidos")
@RestController
public class PedidosController {

    PedidosService pedidosService;

    public PedidosController(PedidosService pedidosService) {
        this.pedidosService = pedidosService;
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> getAllpedidos() {
        return ResponseEntity.ok(pedidosService.getPedidos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> getPedidoId(@PathVariable Long id) {
        return ResponseEntity.ok(pedidosService.getPedidosById(id));
    }

    @PostMapping
    public ResponseEntity<Pedido> addPedido(@RequestBody Pedido pedido) {
        return ResponseEntity.ok(pedidosService.createPedido(pedido));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pedido> updatePedido(@RequestBody Pedido pedido, @PathVariable Long id) {
        pedido.setId(id);
        return ResponseEntity.ok(pedidosService.updatePedido(pedido));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Pedido> deletePedido(@PathVariable Long id) {
        pedidosService.deletePedido(id);
        return ResponseEntity.noContent().build();
    }

}
