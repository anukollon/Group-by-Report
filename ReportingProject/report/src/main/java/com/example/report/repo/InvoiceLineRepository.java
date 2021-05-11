package com.example.report.repo;

import com.example.report.model.InvoiceLine;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "invoice_line",
        path = "invoice_line")
public interface InvoiceLineRepository extends MongoRepository<InvoiceLine, String> {
}
