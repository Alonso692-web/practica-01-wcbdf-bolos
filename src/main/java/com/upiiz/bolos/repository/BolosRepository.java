package com.upiiz.bolos.repository;

import com.upiiz.bolos.models.Bolo;
import com.upiiz.bolos.models.Insumo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class BolosRepository {
    private List<Bolo> bolos = new ArrayList<Bolo>();

    private AtomicLong id = new AtomicLong();

    // POST
    public Bolo guardarBolo(Bolo bolo) {
        bolo.setId(id.incrementAndGet());
        bolos.add(bolo);
        return bolo;
    }

    //GET - Todos los bolos
    public List<Bolo> obtenerTodosBolos() {
        return bolos;
    }

    // GET - Un bolo
    public Bolo obtenerBoloId(Long id) {
        return bolos.stream().filter(b -> b.getId().equals(id)).findFirst().orElse(null);
    }

    // DELETE - Eliminar Bolo
    public void eliminarBolo(Long id) {
        bolos.removeIf(bolo -> bolo.getId().equals(id));
    }

    // PUT - Actualizar
    public Bolo actualizaBolo(Bolo bolo) {
        eliminarBolo(bolo.getId());
        bolos.add(bolo);
        return bolo;
    }

}
