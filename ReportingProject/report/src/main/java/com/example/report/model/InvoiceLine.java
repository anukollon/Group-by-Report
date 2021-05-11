package com.example.report.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "invoice_line")
public class InvoiceLine {
    @Id
    private String id;
    private String quantity;
    private String weight;
    private String unitOfMeasure;
    private String unitPrice;
    private String productId;
    private String invoiceId;

    public InvoiceLine() {
    }

    public InvoiceLine(String id, String quantity, String weight, String unitOfMeasure, String unitPrice, String productId, String invoiceId) {
        this.id = id;
        this.quantity = quantity;
        this.weight = weight;
        this.unitOfMeasure = unitOfMeasure;
        this.unitPrice = unitPrice;
        this.invoiceId = invoiceId;
        this.productId = productId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
}
