package com.example.report.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "invoice")
public class Invoice {
    @Id
    private String id;
    private int invoiceNum;
    private String purchaseDate;
    private String totalPurchase;
    private String[] invoiceLineIds;
    private String customerLocationId;
    private String distributorLocationId;
    public Invoice() {
    }

    public Invoice(String id, int invoiceNum, String purchaseDate, String totalPurchase, String[] invoiceLineIds, String customerLocationId, String distributorLocationId) {
        this.id = id;
        this.invoiceNum = invoiceNum;
        this.purchaseDate = purchaseDate;
        this.totalPurchase = totalPurchase;
        this.invoiceLineIds = invoiceLineIds;
        this.customerLocationId = customerLocationId;
        this.distributorLocationId =distributorLocationId;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getTotalPurchase() {
        return totalPurchase;
    }

    public void setTotalPurchase(String totalPurchase) {
        this.totalPurchase = totalPurchase;
    }

    public String[] getInvoiceLineIds() {
        return invoiceLineIds;
    }

    public void setInvoiceLineIds(String[] invoiceLineIds) {
        this.invoiceLineIds = invoiceLineIds;
    }

    public String getCustomerLocationId() {
        return customerLocationId;
    }

    public void setCustomerLocationId(String customerLocationId) {
        this.customerLocationId = customerLocationId;
    }

    public String getDistributorLocationId() {
        return distributorLocationId;
    }

    public void setDistributorLocationId(String distributorLocationId) {
        this.distributorLocationId = distributorLocationId;
    }
}
