package com.dddmarket.mono.dto;

public class AddProductRequest {

    private String productId;

    public AddProductRequest() {
    }

    public AddProductRequest(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
