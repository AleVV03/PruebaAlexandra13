/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.pruebaVanegas.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Canciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "titulo")
    private String titulo;
    @Column(name = "artista")
    private String artista;
    @Column(name = "album")
    private String album;
    @Column(name = "anio")
    private String anio;

    @OneToMany(mappedBy = "canciones")
    
    private List<Lista> lista;
}
