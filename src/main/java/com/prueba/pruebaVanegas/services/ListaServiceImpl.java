/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.pruebaVanegas.services;


import com.prueba.pruebaVanegas.models.Lista;
import com.prueba.pruebaVanegas.repositorio.ListaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author 59398
 */
@Service
public class ListaServiceImpl extends GenericServiceImpl<Lista, Integer> implements ListaService {

    @Autowired
    ListaRepository listaRepository;

    @Override
    public CrudRepository<Lista, Integer> getDao() {
        return listaRepository;
    }

}
