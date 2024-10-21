package com.upiiz.bolos.services;

import com.upiiz.bolos.models.Dulce;
import com.upiiz.bolos.repository.DulcesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DulcesService {

    DulcesRepository dulcesRepository;

    public DulcesService(DulcesRepository dulcesRepository) {
        this.dulcesRepository = dulcesRepository;
    }

    // GET Todos los dulces
    public List<Dulce> getAllDulces() {
        return dulcesRepository.obtenerDulces();
    }

    // GET Dulce por id
    public Dulce getDulceById(Long id) {
        return dulcesRepository.obtenerDulcePorId(id);
    }

    // POST Crear dulce
    public Dulce createDulce(Dulce dulce) {
        return dulcesRepository.guardarDulce(dulce);
    }

    // PUT Actualizar
    public Dulce updateDulce(Dulce dulce) {
        return dulcesRepository.actualizarDulce(dulce);
    }

    // DELETE Borrar
    public void deleteDulce(Long id) {
        dulcesRepository.eliminarDulce(id);
    }

}
