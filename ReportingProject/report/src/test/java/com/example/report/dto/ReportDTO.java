package com.example.report.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportDTO{
    private int productCode;
    private String description;
    private String distName;
    private String distAddress;
    private String manufName;
    private String manufAddress;
    private String custName;
    private String custAddress;
    private String invoiceNum;
    private String invoiceDate;
    private String purchasedDate;
    private String unitOfMeasure;
    private String purchasedWgt;
    private String purchasedQty;
    private String unitPrice;
    private String totalPrice;

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDistName() {
        return distName;
    }

    public void setDistName(String distName) {
        this.distName = distName;
    }

    public String getDistAddress() {
        return distAddress;
    }

    public void setDistAddress(String distAddress) {
        this.distAddress = distAddress;
    }

    public String getManufName() {
        return manufName;
    }

    public void setManufName(String manufName) {
        this.manufName = manufName;
    }

    public String getManufAddress() {
        return manufAddress;
    }

    public void setManufAddress(String manufAddress) {
        this.manufAddress = manufAddress;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getPurchasedDate() {
        return purchasedDate;
    }

    public void setPurchasedDate(String purchasedDate) {
        this.purchasedDate = purchasedDate;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getPurchasedWgt() {
        return purchasedWgt;
    }

    public void setPurchasedWgt(String purchasedWgt) {
        this.purchasedWgt = purchasedWgt;
    }

    public String getPurchasedQty() {
        return purchasedQty;
    }

    public void setPurchasedQty(String purchasedQty) {
        this.purchasedQty = purchasedQty;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
}
