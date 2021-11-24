package com.villavoemprende.apirestcluster.controllers;


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.villavoemprende.apirestcluster.models.EmpresaModel;
import com.villavoemprende.apirestcluster.services.EmpresaService;

@RestController 
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;
        
    @GetMapping()
    public ArrayList<EmpresaModel> obtenerEmpresas(){
        return empresaService.obtenerEmpresas();
    }

    @PostMapping()
    public EmpresaModel guardarEmpresa(@RequestBody EmpresaModel empresa){
        return empresaService.guardarEmpresa(empresa);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarEmpresaPorId(@PathVariable ("id") Long id ){
        boolean resultadoEliminar=this.empresaService.eliminarEmpresa(id);
        if (resultadoEliminar){
            return "Se eliminó la empresa con id: "+id;
        }else{
            return "No se pudo eliminar la empresa con el id: "+id;
        }
    }
    
    @GetMapping(path = "/{id}")
    public Optional<EmpresaModel> obtenerEmpresaPorId(@PathVariable("id") Long id){
        return this.empresaService.obtenerEmpresaPorId(id);
    }
    

}
