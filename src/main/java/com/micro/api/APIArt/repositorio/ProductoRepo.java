package com.micro.api.APIArt.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.micro.api.APIArt.modelo.copy.Producto;

@Repository
public interface ProductoRepo extends MongoRepository<Producto, String>{

}
