package com.dddmarket.mono.dto;

public class PlaceOrderRequest {

    private String mail;

    public PlaceOrderRequest() {
    }

    public PlaceOrderRequest(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
