package com.upiiz.bolos.controllers;

import com.upiiz.bolos.models.Bolo;
import com.upiiz.bolos.models.Insumo;
import com.upiiz.bolos.services.BolosService;
import com.upiiz.bolos.services.InsumosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/insumos")
@RestController
public class InsumosController {

    InsumosService insumosService;

    public InsumosController(InsumosService bolosService) {
        this.insumosService = bolosService;
    }

    // GET - Todos los Insumos
    @GetMapping
    public ResponseEntity<List<Insumo>> getInsumos() {
        return ResponseEntity.ok(insumosService.getAllInsumos());
    }

    // GET - Un insumo
    @GetMapping("/{id}")
    public ResponseEntity<Insumo> getInsumo(@PathVariable Long id) {
        return ResponseEntity.ok(insumosService.getInsumoById(id));
    }

    // POST - Crear un Insumo
    @PostMapping
    public ResponseEntity<Insumo> addInsumo(@RequestBody Insumo insumo) {
        return ResponseEntity.ok(insumosService.createInsumo(insumo));
    }

    // PUT - Actualizar un Insumo
    @PutMapping("/{id}")
    public ResponseEntity<Insumo> updateInsumo(@RequestBody Insumo insumo, @PathVariable Long id) {
        insumo.setId(id);
        return ResponseEntity.ok(insumosService.updateInsumo(insumo));
    }

    // DELETE - Eliminar Insumo
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInsumo(@PathVariable Long id) {
        insumosService.deleteInsumo(id);
        return ResponseEntity.noContent().build();
    }

}
