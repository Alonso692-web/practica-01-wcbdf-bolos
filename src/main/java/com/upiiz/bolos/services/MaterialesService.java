package com.upiiz.bolos.services;

import com.upiiz.bolos.models.Material;
import com.upiiz.bolos.repository.MaterialesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialesService {

    MaterialesRepository materialesRepository;
    public MaterialesService(MaterialesRepository materialesRepository) {
        this.materialesRepository = materialesRepository;
    }

    // GET Todos los materiales
    public List<Material> getAllMateriales() {
        return materialesRepository.obtenerTodosMateriales();
    }

    // GET un material
    public Material getMaterialById(Long id) {
        return materialesRepository.obtenerMaterialId(id);
    }

    // POST
    public Material createMaterial(Material material) {
        return materialesRepository.guardarMaterial(material);
    }

    // PUT
    public Material updateMaterial(Material material) {
        return materialesRepository.actualizaMaterial(material);
    }

    // DELETE
    public void deleteMaterial(Long id) {
        materialesRepository.eliminarMaterial(id);
    }

}
