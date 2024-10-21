package com.upiiz.bolos.controllers;

import com.upiiz.bolos.models.Bolo;
import com.upiiz.bolos.models.Insumo;
import com.upiiz.bolos.services.BolosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/bolos")
@RestController
public class BolosController {
    BolosService bolosService;

    public BolosController(BolosService bolosService) {
        this.bolosService = bolosService;
    }

    // GET - Todos los bolos
    @GetMapping
    public ResponseEntity<List<Bolo>> getBolos() {
        return ResponseEntity.ok(bolosService.getAllBolos());
    }

    // GET - Un bolo
    @GetMapping("/{id}")
    public ResponseEntity<Bolo> getBolo(@PathVariable Long id) {
        return ResponseEntity.ok(bolosService.getBoloById(id));
    }

    // POST - Crear un bolo
    @PostMapping
    public ResponseEntity<Bolo> addBolo(@RequestBody Bolo bolo) {
        return ResponseEntity.ok(bolosService.createBolo(bolo));
    }

    // PUT - Actualizar un bolo
    @PutMapping("/{id}")
    public ResponseEntity<Bolo> updateBolo(@RequestBody Bolo bolo, @PathVariable Long id) {
        bolo.setId(id);
        return ResponseEntity.ok(bolosService.updateBolo(bolo));
    }

    // DELETE - Eliminar bolo
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBolo(@PathVariable Long id) {
        bolosService.deleteBolo(id);
        return ResponseEntity.noContent().build();
    }

}
