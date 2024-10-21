package com.upiiz.bolos.controllers;

import com.upiiz.bolos.models.Dulce;
import com.upiiz.bolos.services.DulcesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/dulces")
@RestController
public class DulcesController {

    DulcesService dulcesService;

    public DulcesController(DulcesService dulcesService) {
        this.dulcesService = dulcesService;
    }

    @GetMapping
    public ResponseEntity<List<Dulce>> getAllDulces() {
        return ResponseEntity.ok(dulcesService.getAllDulces());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dulce> getDulce(@PathVariable Long id) {
        return ResponseEntity.ok(dulcesService.getDulceById(id));
    }

    @PostMapping
    public ResponseEntity<Dulce> addDulce(@RequestBody Dulce dulce) {
        return ResponseEntity.ok(dulcesService.createDulce(dulce));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dulce> updateDulce(@PathVariable Long id, @RequestBody Dulce dulce) {
        dulce.setId(id);
        return ResponseEntity.ok(dulcesService.updateDulce(dulce));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDulce(@PathVariable Long id) {
        dulcesService.deleteDulce(id);
        return ResponseEntity.noContent().build();
    }

}
