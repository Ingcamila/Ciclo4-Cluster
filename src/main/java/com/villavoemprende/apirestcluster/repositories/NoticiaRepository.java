package com.villavoemprende.apirestcluster.repositories;

import com.villavoemprende.apirestcluster.models.NoticiaModel;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoticiaRepository extends MongoRepository<NoticiaModel, Long> {
    
}
