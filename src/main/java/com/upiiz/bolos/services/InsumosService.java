package com.upiiz.bolos.services;

import com.upiiz.bolos.models.Insumo;
import com.upiiz.bolos.repository.InsumosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsumosService {

    InsumosRepository insumosRepository;

    public InsumosService(InsumosRepository insumosRepository) {
        this.insumosRepository = insumosRepository;
    }

    // GET -Todos los insumos
    public List<Insumo> getAllInsumos() {
        return insumosRepository.obtenerTodosInsumos();
    }

    // GET - Un insumo
    public Insumo getInsumoById(Long id) {
        return insumosRepository.obtenerInsumoId(id);
    }

    // POST - Crear insumo
    public Insumo createInsumo(Insumo bolo) {
        return insumosRepository.guardarInsumo(bolo);
    }

    // PUT - Actualizar insumo
    public Insumo updateInsumo(Insumo bolo) {
        return insumosRepository.actualizarInsumo(bolo);
    }

    // DELETE - Borrar un insumo
    public void deleteInsumo(Long id) {
        insumosRepository.eliminarInsumo(id);
    }

}
