package com.upiiz.bolos.repository;

import com.upiiz.bolos.models.Bolo;
import com.upiiz.bolos.models.Material;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class MaterialesRepository {

    List<Material> materiales = new ArrayList<Material>();
    AtomicLong id = new AtomicLong();

    // POST
    public Material guardarMaterial(Material material) {
        material.setId(id.incrementAndGet());
        materiales.add(material);
        return material;
    }

    //GET - Todos los Materiales
    public List<Material> obtenerTodosMateriales() {
        return materiales;
    }

    // GET - Un Material
    public Material obtenerMaterialId(Long id) {
        return materiales.stream().filter(m -> m.getId().equals(id)).findFirst().orElse(null);
    }

    // DELETE - Eliminar Material
    public void eliminarMaterial(Long id) {
        materiales.removeIf(material -> material.getId().equals(id));
    }

    // PUT - Actualizar
    public Material actualizaMaterial(Material material) {
        eliminarMaterial(material.getId());
        materiales.add(material);
        return material;
    }

}
