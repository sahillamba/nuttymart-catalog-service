package com.nuttymart.catalog_service.repository;

import com.nuttymart.catalog_service.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product,String> {
    public List<Product> findByName(String name);

}
