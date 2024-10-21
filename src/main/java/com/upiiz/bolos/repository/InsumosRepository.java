package com.upiiz.bolos.repository;

import com.upiiz.bolos.models.Insumo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class InsumosRepository {

    private List<Insumo> insumos = new ArrayList<Insumo>();

    private AtomicLong id = new AtomicLong();

    // POST
    public Insumo guardarInsumo(Insumo insumo) {
        insumo.setId(id.incrementAndGet());
        insumos.add(insumo);
        return insumo;
    }

    //GET - Todos los insumos
    public List<Insumo> obtenerTodosInsumos() {
        return insumos;
    }

    // GET - Un insumo
    public Insumo obtenerInsumoId(Long id) {
        return insumos.stream().filter(insumo -> insumo.getId().equals(id)).findFirst().orElse(null);
    }

    // DELETE - Eliminar Insumo
    public void eliminarInsumo(Long id) {
        insumos.removeIf(insumo -> insumo.getId().equals(id));
    }

    // PUT - Actualizar
    public Insumo actualizarInsumo(Insumo insumo) {
        eliminarInsumo(insumo.getId());
        insumos.add(insumo);
        return insumo;
    }

}
