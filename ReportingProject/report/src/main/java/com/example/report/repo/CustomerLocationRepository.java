package com.example.report.repo;

import com.example.report.model.CustomerLocation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "customer_location",
        path = "customer_location")
public interface CustomerLocationRepository extends MongoRepository<CustomerLocation,String> {
}
