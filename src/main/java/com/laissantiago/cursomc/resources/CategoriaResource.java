package com.laissantiago.cursomc.resources;

import com.laissantiago.cursomc.domain.Categoria;
import com.laissantiago.cursomc.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService service;


    @GetMapping(value = "/{id}")
    public ResponseEntity<Categoria> find(@PathVariable Integer id){

        Categoria obj = service.buscar(id);
        return ResponseEntity.ok().body(obj);

    }
}
