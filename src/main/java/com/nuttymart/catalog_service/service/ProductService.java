package com.nuttymart.catalog_service.service;

import com.nuttymart.catalog_service.domain.Product;
import com.nuttymart.catalog_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public Product getProductById(String id){
        return repository.findOne(id);
    }
    public Product saveNewProduct(Product newProduct){
        return repository.save(newProduct);
    }

}
