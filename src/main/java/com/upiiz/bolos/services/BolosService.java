package com.upiiz.bolos.services;

import com.upiiz.bolos.models.Bolo;
import com.upiiz.bolos.models.Insumo;
import com.upiiz.bolos.repository.BolosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BolosService {

    BolosRepository bolosRepository;

    public BolosService(BolosRepository bolosRepository) {
        this.bolosRepository = bolosRepository;
    }

    // GET -Todos los bolos
    public List<Bolo> getAllBolos() {
        return bolosRepository.obtenerTodosBolos();
    }

    // GET - Un bolo
    public Bolo getBoloById(Long id) {
        return bolosRepository.obtenerBoloId(id);
    }

    // POST - Crear bolo
    public Bolo createBolo(Bolo bolo) {
        return bolosRepository.guardarBolo(bolo);
    }

    // PUT - Actualizar bolo
    public Bolo updateBolo(Bolo bolo) {
        return bolosRepository.actualizaBolo(bolo);
    }

    // DELETE - Borrar un bolo
    public void deleteBolo(Long id) {
        bolosRepository.eliminarBolo(id);
    }

}
