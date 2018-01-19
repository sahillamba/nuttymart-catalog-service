package com.nuttymart.catalog_service.domain;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Product {

    @Id
    private String id;
    private String name;
    private String USP;
    private String description;
    private List<Attribute> attibutes;

    public Product(){

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

    public String getUSP() {
        return USP;
    }

    public void setUSP(String USP) {
        this.USP = USP;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Attribute> getAttibutes() {
        return attibutes;
    }

    public void setAttibutes(List<Attribute> attibutes) {
        this.attibutes = attibutes;
    }

    public Product(String id, String name, String USP, String description, List<Attribute> attibutes) {
        this.id = id;
        this.name = name;
        this.USP = USP;
        this.description = description;
        this.attibutes = attibutes;
    }
}


// USP, description, attributes, price, stock