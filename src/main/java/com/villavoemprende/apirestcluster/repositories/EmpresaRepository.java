package com.villavoemprende.apirestcluster.repositories;

import java.util.Optional;

import com.villavoemprende.apirestcluster.models.EmpresaModel;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpresaRepository extends MongoRepository<EmpresaModel, Long> {
    
    Optional<EmpresaModel> findByRazonSocial(String razonSocial);

}
