package com.dddmarket.mono.controller;

import com.dddmarket.mono.dto.PlaceOrderRequest;
import com.dddmarket.mono.entity.Order;
import com.dddmarket.mono.repository.OrderRepository;
import com.dddmarket.mono.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private CartService cartService;

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/order/place")
    public String placeOrder(@RequestBody PlaceOrderRequest request) {


        Order save = orderRepository.save(cartService.createOrder(request.getMail()));

        if(save != null) {
            return "success";
        }
        return "fail";
    }

}
