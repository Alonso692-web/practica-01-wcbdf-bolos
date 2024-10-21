package com.upiiz.bolos.controllers;

import com.upiiz.bolos.models.Almacen;
import com.upiiz.bolos.services.AlmacenService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/almacen")
@RestController
public class AlmacenController {

    AlmacenService almacenService;

    public AlmacenController(AlmacenService almacenService) {
        this.almacenService = almacenService;
    }

    @GetMapping
    public ResponseEntity<List<Almacen>> getAll() {
        return ResponseEntity.ok(almacenService.obtenerAlmacenes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Almacen> getAlmacenById(@PathVariable Long id) {
        return ResponseEntity.ok(almacenService.obtenerAlmacen(id));
    }

    @PostMapping
    public ResponseEntity<Almacen> addAlmacen(@RequestBody Almacen almacen) {
        return ResponseEntity.ok(almacenService.agregarAlmacen(almacen));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Almacen> updateAlmacen(@RequestBody Almacen almacen, @PathVariable Long id) {
        almacen.setId(id);
        return ResponseEntity.ok(almacenService.actualizarAlmacen(almacen));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAlmacen(@PathVariable Long id) {
        almacenService.borrarAlmacen(id);
        return ResponseEntity.noContent().build();
    }
}
