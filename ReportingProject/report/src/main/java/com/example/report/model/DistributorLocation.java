package com.example.report.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "distributor_location")
public class DistributorLocation {
    @Id
    private String id;
    private String name;
    private String address;
    private String contact;
    private String[] invoiceIds;
    private String[] productIds;

    public DistributorLocation() {
    }

    public DistributorLocation(String id, String name, String address, String contact, String[] invoiceIds, String[] productIds) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.invoiceIds = invoiceIds;
        this.productIds = productIds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String[] getInvoiceIds() {
        return invoiceIds;
    }

    public void setInvoiceIds(String[] invoiceIds) {
        invoiceIds = invoiceIds;
    }

    public String[] getProductIds() {
        return productIds;
    }

    public void setProductIds(String[] productIds) {
        this.productIds = productIds;
    }
}
