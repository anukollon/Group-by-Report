package com.example.report.repo;

import com.example.report.model.Manufacturer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "manufacturer_location",
        path = "manufacturer_location")
public interface ManufacturerLocationRepository extends MongoRepository<Manufacturer,String> {
}
