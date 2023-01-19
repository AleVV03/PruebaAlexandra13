/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba.pruebaVanegas.repositorio;

import com.prueba.pruebaVanegas.models.Canciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author 59398
 */
public interface CancionesRepository extends JpaRepository<Canciones, Integer> {

    @Query(value = "Select * from canciones c where c.nombre = :nombre", nativeQuery = true)
    public Canciones buscarCancion(String nombre);
}
