package com.villavoemprende.apirestcluster.services;

import java.util.ArrayList;
import java.util.Optional;

import com.villavoemprende.apirestcluster.models.EmpresaModel;
import com.villavoemprende.apirestcluster.repositories.EmpresaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;

    public ArrayList<EmpresaModel> obtenerEmpresas(){
        return (ArrayList<EmpresaModel>) empresaRepository.findAll();
    }

    public EmpresaModel guardarEmpresa(EmpresaModel empresa){
        return empresaRepository.save(empresa);

    }

    public boolean eliminarEmpresa(Long id){

        if (empresaRepository.existsById(id)){
            empresaRepository.deleteById(id);
            return true;
        }else{
            return false;
        }      
                             
    }  
    
    public Optional<EmpresaModel> obtenerEmpresaPorId(Long id){
        return empresaRepository.findById(id);
    }
}
