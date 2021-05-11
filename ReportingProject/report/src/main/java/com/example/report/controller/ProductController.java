package com.example.report.controller;

import com.example.report.dto.ReportDTO;
import com.example.report.model.*;
import com.example.report.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class ProductController {
@Autowired
    private ProductRepository productRepository;
    @Autowired
    private DistributorLocationRepository distributorLocationRepository;
    @Autowired
    private InvoiceLineRepository invoiceLineRepository;
    @Autowired
    private CustomerLocationRepository customerLocationRepository;
    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private ManufacturerLocationRepository manufacturerLocationRepository;

    @GetMapping("/product")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<ReportDTO> getByProducts(){
        List<ReportDTO> reportList = getData();
        Collections.sort(reportList, (o1, o2) -> o1.getProductCode() - o2.getProductCode());
        return reportList;
    }
    @GetMapping("/invoice")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<ReportDTO> getByInvoices(){
        List<ReportDTO> reportList = getData();
        Collections.sort(reportList, (o1, o2) -> o1.getInvoiceNum() - o2.getInvoiceNum());
        return reportList;
    }
    @GetMapping("/distributor")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<ReportDTO> getByDistributor(){
        List<ReportDTO> reportList = getData();
        reportList.sort(Comparator.comparing(ReportDTO::getDistName));
        return reportList;
    }
    @GetMapping("/customerLoc")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<ReportDTO> getByCustomerLocation(){
        List<ReportDTO> reportList = getData();
        reportList.sort(Comparator.comparing(ReportDTO::getCustAddress));
        return reportList;
    }
    public List<ReportDTO> getData(){
        List<ReportDTO> reportList = new ArrayList<ReportDTO>();
        List<InvoiceLine> invoiceLines = invoiceLineRepository.findAll();
        List<Product> products = productRepository.findAll();
        List<DistributorLocation> distributorLocations = distributorLocationRepository.findAll();
        List<Manufacturer> manufacturerLocations = manufacturerLocationRepository.findAll();
        List<CustomerLocation> customerLocations = customerLocationRepository.findAll();
        List<Invoice> invoices = invoiceRepository.findAll();

        for(Product prods: products){
            ReportDTO report = new ReportDTO();
            String[] invoiceLineIds = prods.getInvoiceLineIds();
            for(String iLId: invoiceLineIds){
                for(InvoiceLine invoiceLine:invoiceLines){
                    if(invoiceLine.getId().equals(iLId)){
                        report.setProductCode(prods.getProductCode());
                        report.setDescription(prods.getDescription());
                        report.setPurchasedWgt(invoiceLine.getWeight());
                        report.setPurchasedQty(invoiceLine.getQuantity());
                        report.setUnitOfMeasure(invoiceLine.getUnitOfMeasure());
                        report.setUnitPrice(invoiceLine.getUnitPrice());

                        for(Invoice invoice: invoices){

                            if(invoice.getId().equals(invoiceLine.getInvoiceId())){

                                report.setInvoiceNum(invoice.getInvoiceNum());
                                report.setInvoiceDate(invoice.getPurchaseDate());
                                report.setTotalPrice(invoice.getTotalPurchase());

                                for(CustomerLocation custLoc:customerLocations){
                                    if(custLoc.getId().equals(invoice.getCustomerLocationId())){
                                        report.setCustName(custLoc.getName());
                                        report.setCustAddress(custLoc.getAddress());
                                    }
                                }
                            }
                        }
                        for(DistributorLocation distLoc:distributorLocations){
                            if(distLoc.getId().equals(prods.getDistributorLocationId())){
                                report.setDistName(distLoc.getName());
                                report.setDistAddress(distLoc.getAddress());
                            }
                        }
                        for(Manufacturer manufLoc:manufacturerLocations){
                            if(manufLoc.getId().equals(prods.getManufacturerLocationId())){
                                report.setManufName(manufLoc.getName());
                                report.setManufAddress(manufLoc.getAddress());
                            }
                        }
                    }
                }
            }
            reportList.add(report);
        }
        return reportList;
    }
}
