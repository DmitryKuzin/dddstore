package com.dddmarket.mono.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Document
public class Order {

    @Id
    private String id;
    private String mail;
    private BigDecimal price;
    private List<String> productsIds;

    public Order() {
    }

    public Order(String id, String mail, BigDecimal price, List<String> productsIds) {
        this.id = id;
        this.mail = mail;
        this.price = price;
        this.productsIds = productsIds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<String> getProductsIds() {
        return productsIds;
    }

    public void setProductsIds(List<String> productsIds) {
        this.productsIds = productsIds;
    }
}
