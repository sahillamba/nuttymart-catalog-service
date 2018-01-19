package com.nuttymart.catalog_service.routes;

import com.nuttymart.catalog_service.domain.Product;
import com.nuttymart.catalog_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product" )
public class ProductRoutes {

    @Autowired
    public ProductService productService;

    @RequestMapping(
            value = "/get/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Product getEmployee(@PathVariable("id") String id){
        return productService.getProductById(id);
    }

    @RequestMapping(
            value = "/save",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public Product saveEmployee(@RequestBody Product product){
        return productService.saveNewProduct(product);
    }
}
