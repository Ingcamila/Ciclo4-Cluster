package com.villavoemprende.apirestcluster.controllers;


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.villavoemprende.apirestcluster.models.ClienteModel;
import com.villavoemprende.apirestcluster.services.ClienteService;

@RestController 
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;
        
    @GetMapping()
    public ArrayList<ClienteModel> obtenerClientes(){
        return ClienteService.obtenerClientes();
    }

    @PostMapping()
    public ClienteModel guardarCliente(){
        return clienteService.guardarCliente(cliente);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarClientePorId(@PathVariable ("id") Long id ){
        boolean resultadoEliminar=this.clienteService.eliminarCliente(id);
        if (resultadoEliminar){
            return "Se eliminó el usuario con id: "+id;
        }else{
            return "No se pudo eliminar el usuario con el id: "+id;
        }
    }
    
    @GetMapping(path = "/{id}")
    public Optional<ClienteModel> obtenerCliOptional(@PathVariable("id") Long id){
        return this.clienteService.obtenerClientePorId(id);
    }
    

}