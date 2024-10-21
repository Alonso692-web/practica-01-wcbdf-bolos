package com.upiiz.bolos.services;

import com.upiiz.bolos.models.Almacen;
import com.upiiz.bolos.repository.AlmacenRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlmacenService {

    AlmacenRepository almacenRepository;

    public AlmacenService(AlmacenRepository almacenRepository) {
        this.almacenRepository = almacenRepository;
    }

    public List<Almacen> obtenerAlmacenes() {
        return almacenRepository.obtenerAlmacenes();
    }

    public Almacen obtenerAlmacen(Long id) {
        return almacenRepository.obtenerAlmacen(id);
    }

    public Almacen agregarAlmacen(Almacen almacen) {
        return almacenRepository.guardarAlmacen(almacen);
    }

    public Almacen actualizarAlmacen(Almacen almacen) {
        return almacenRepository.actualizarAlmacen(almacen);
    }
    public void borrarAlmacen(Long id){
        almacenRepository.borrarAlmacen(id);
    }

}
