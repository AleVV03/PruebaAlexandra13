/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.pruebaVanegas.controller;


import com.prueba.pruebaVanegas.models.Canciones;
import com.prueba.pruebaVanegas.services.CancionesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CancionesController {

    @Autowired
    CancionesService cancionesService;

    @GetMapping("/listar")
    public ResponseEntity< List<Canciones>> obtenerLista() {
        return new ResponseEntity<>(cancionesService.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Canciones> crear(@RequestBody Canciones c){
     return new ResponseEntity<>(cancionesService.save(c), HttpStatus.CREATED);
    }
    
    @GetMapping("/buscarcliente/{id}")
	public Canciones findbyid(@PathVariable Integer id){
		return cancionesService.findById(id);
	}
        @PutMapping("/editarcliente/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Canciones edit(@RequestBody Canciones objeto, @PathVariable Integer id) {
		Canciones clientedit=cancionesService.findById(id);
		clientedit.setTitulo(objeto.getTitulo());
		clientedit.setArtista(objeto.getArtista());
		clientedit.setAlbum(objeto.getAlbum());
                clientedit.setAnio(objeto.getAnio());
		return cancionesService.save(clientedit);
	}
	
	@DeleteMapping("/eliminarcliente/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@PathVariable Integer id) {
		cancionesService.delete(id);
	}
}
