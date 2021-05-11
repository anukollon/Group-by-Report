package com.example.report.repo;

import com.example.report.model.DistributorLocation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "distributor_location",
        path = "distributor_location")
public interface DistributorLocationRepository extends MongoRepository<DistributorLocation,String> {
}
