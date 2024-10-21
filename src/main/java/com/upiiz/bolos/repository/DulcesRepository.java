package com.upiiz.bolos.repository;

import com.upiiz.bolos.models.Dulce;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class DulcesRepository {

    List<Dulce> dulces = new ArrayList<Dulce>();
    AtomicLong id = new AtomicLong();

    // GET Todos los dulces
    public List<Dulce> obtenerDulces(){
        return dulces;
    }

    // GET Un dulces por Id
    public Dulce obtenerDulcePorId(Long id){
        return dulces.stream().filter(dulce -> dulce.getId().equals(id)).findFirst().orElse(null);
    }

    // POST Dulce
    public Dulce guardarDulce(Dulce dulce){
        dulce.setId(id.incrementAndGet());
        dulces.add(dulce);
        return dulce;
    }

    // DELETE Eliminar por Id
    public void eliminarDulce(Long id){
        dulces.removeIf(dulce -> dulce.getId().equals(id));
    }

    // PUT Actualizar dulce
    public Dulce actualizarDulce(Dulce dulce){
        eliminarDulce(dulce.getId());
        dulces.add(dulce);
        return dulce;
    }

}
