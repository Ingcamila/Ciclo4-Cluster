package com.villavoemprende.apirestcluster.services;

import java.util.ArrayList;
import java.util.Optional;

import com.villavoemprende.apirestcluster.models.NoticiaModel;
import com.villavoemprende.apirestcluster.repositories.NoticiaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticiaService {
    @Autowired
    NoticiaRepository noticiaRepository;

    public ArrayList<NoticiaModel> obtenerNoticias(){
        return (ArrayList<NoticiaModel>) noticiaRepository.findAll();
    }

    public NoticiaModel guardarActualizarNoticia(NoticiaModel noticia){
        return noticiaRepository.save(noticia);

    }

    public boolean eliminarNoticia(Long id){

        if (noticiaRepository.existsById(id)){
            noticiaRepository.deleteById(id);
            return true;
        }else{
            return false;
        }      
                             
    }  
    
    public Optional<NoticiaModel> obtenerNoticiaPorId(Long id){
        return noticiaRepository.findById(id);
    }
}
