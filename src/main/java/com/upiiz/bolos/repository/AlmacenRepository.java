package com.upiiz.bolos.repository;

import com.upiiz.bolos.models.Almacen;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class AlmacenRepository {

    List<Almacen> almacenes = new ArrayList<Almacen>();
    AtomicLong id = new AtomicLong();

    // GET Todos
    public List<Almacen> obtenerAlmacenes() {
        return almacenes;
    }

    // GET
    public Almacen obtenerAlmacen(Long id) {
        return almacenes.stream().filter(almacen -> almacen.getId().equals(id)).findFirst().orElse(null);
    }

    // POST Crear
    public Almacen guardarAlmacen(Almacen almacen) {
        almacen.setId(id.incrementAndGet());
        almacenes.add(almacen);
        return almacen;
    }

    // PUT Actualizar
    public Almacen actualizarAlmacen(Almacen almacen) {
        borrarAlmacen(almacen.getId());
        almacenes.add(almacen);
        return almacen;
    }


    // DELETE Borrar
    public void borrarAlmacen(Long id) {
        almacenes.removeIf(almacen -> almacen.getId().equals(id));
    }

}
