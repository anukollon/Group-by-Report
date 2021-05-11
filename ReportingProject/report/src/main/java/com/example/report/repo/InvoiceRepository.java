package com.example.report.repo;

import com.example.report.model.Invoice;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "invoice",
        path = "invoice")
public interface InvoiceRepository extends MongoRepository<Invoice, String> {

}

