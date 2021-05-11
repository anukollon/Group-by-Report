package com.example.report.repo;

import com.example.report.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "product",
        path = "product")
public interface ProductRepository extends MongoRepository<Product, String> {
}
