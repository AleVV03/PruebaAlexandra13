/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.pruebaVanegas.services;


import com.prueba.pruebaVanegas.models.Canciones;
import com.prueba.pruebaVanegas.repositorio.CancionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author 59398
 */
@Service
public class CancionesServiceImpl extends GenericServiceImpl<Canciones, Integer> implements CancionesService {

    @Autowired
    CancionesRepository cancionesRepository;

    @Override
    public CrudRepository<Canciones, Integer> getDao() {
        return cancionesRepository;
    }

    public Canciones buscarCancion(String nombre) {
        return cancionesRepository.buscarCancion(nombre);
    }

}
