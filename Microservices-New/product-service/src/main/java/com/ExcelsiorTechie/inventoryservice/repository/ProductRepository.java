package com.ExcelsiorTechie.inventoryservice.repository;

import com.ExcelsiorTechie.inventoryservice.model.Product;

import org.springframework.data.mongodb.repository.MongoRepository;




public interface ProductRepository extends MongoRepository<Product, String> {
}

