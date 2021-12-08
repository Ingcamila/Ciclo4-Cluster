package com.villavoemprende.apirestcluster.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.villavoemprende.apirestcluster.models.NoticiaModel;
import com.villavoemprende.apirestcluster.services.NoticiaService;

@RestController 
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/noticia")

public class NoticiaController {
    @Autowired
    NoticiaService noticiaService;
        
    @GetMapping()
    public ArrayList<NoticiaModel> obtenerNoticias(){
        return noticiaService.obtenerNoticias();
    }

    @GetMapping(path = "/{id}")
    public Optional<NoticiaModel> obtenerNoticiaPorId(@PathVariable("id") Long id){
        return this.noticiaService.obtenerNoticiaPorId(id);
    }

    @PostMapping()
    public NoticiaModel guardarNoticia(@RequestBody NoticiaModel noticia){
        return noticiaService.guardarActualizarNoticia(noticia);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarNoticiaPorId(@PathVariable ("id") Long id ){
        boolean resultadoEliminar=this.noticiaService.eliminarNoticia(id);
        if (resultadoEliminar){
            return "Se eliminó la noticia con id: "+id;
        }else{
            return "No se pudo eliminar la noticia con el id: "+id;
        }
    }

    @PutMapping()
    public NoticiaModel actualizarNoticia(@RequestBody NoticiaModel noticia){
        return noticiaService.guardarActualizarNoticia(noticia);
    }
}
