package com.upiiz.bolos.controllers;

import com.upiiz.bolos.models.Material;
import com.upiiz.bolos.services.MaterialesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/materiales")
@RestController
public class MaterialesController {

    MaterialesService materialesService;
    public MaterialesController(MaterialesService materialesService) {
        this.materialesService = materialesService;
    }

    // GET
    @GetMapping
    public ResponseEntity<List<Material>> getAllMateriales() {
        return ResponseEntity.ok(materialesService.getAllMateriales());
    }

    // GET Material por Id
    @GetMapping("/{id}")
    public ResponseEntity<Material> getMaterialById(@PathVariable Long id) {
        return ResponseEntity.ok(materialesService.getMaterialById(id));
    }

    // POST Material
    @PostMapping
    public ResponseEntity<Material> addMaterial(@RequestBody Material material) {
        return ResponseEntity.ok(materialesService.createMaterial(material));
    }

    // PUT Actualizar
    @PutMapping("/{id}")
    public ResponseEntity<Material> updateMaterial(@PathVariable Long id, @RequestBody Material material) {
        material.setId(id);
        return ResponseEntity.ok(materialesService.updateMaterial(material));
    }

    // DELETE Borrar
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMaterial(@PathVariable Long id) {
        materialesService.deleteMaterial(id);
        return ResponseEntity.noContent().build();
    }


}
