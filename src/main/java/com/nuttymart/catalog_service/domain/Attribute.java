package com.nuttymart.catalog_service.domain;

public class Attribute {
    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public Attribute(){

    }

    public Attribute(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(String key) {
        this.key = key;

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
