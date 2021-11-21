package com.villavoemprende.apirestcluster.repositories;

import com.villavoemprende.apirestcluster.models.ClienteModel;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<ClienteModel, Long> {
    
}
