package com.example.report.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.*;

@Data
@Document(collection = "product")
public class Product {
    @Id
    private String id;
    private String description;
    private int productCode;
    private String[] invoiceLineIds;
    private String distributorLocationId;
    private String manufacturerLocationId;

    public Product() {
    }

    public Product(String id, String description, int productCode, String[] invoiceLineIds, String distributorLocationId, String manufacturerLocationId) {
        this.id = id;
        this.description = description;
        this.productCode = productCode;
        this.invoiceLineIds = invoiceLineIds;
        this.manufacturerLocationId = manufacturerLocationId;
        this.distributorLocationId = distributorLocationId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String[] getInvoiceLineIds() {
        return invoiceLineIds;
    }

    public void setInvoiceLineIds(String[] invoiceLineIds) {
        this.invoiceLineIds = invoiceLineIds;
    }

    public String getDistributorLocationId() {
        return distributorLocationId;
    }

    public void setDistributorLocationId(String distributorLocationId) {
        this.distributorLocationId = distributorLocationId;
    }

    public String getManufacturerLocationId() {
        return manufacturerLocationId;
    }

    public void setManufacturerLocationId(String manufacturerLocationId) {
        this.manufacturerLocationId = manufacturerLocationId;
    }
}
