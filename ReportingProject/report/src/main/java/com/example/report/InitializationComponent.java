package com.example.report;

import com.example.report.model.Product;
import com.example.report.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitializationComponent {

    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    private void init(){

/*        productRepository.deleteAll();

        Product product=new Product();
        product.setDescription("ABC");
        product.setProductCode(1);
        product.setDistributorLocationId("ABBB");
        product.setManufacturerId("CCC");
        productRepository.save(product);*/
    }
}
