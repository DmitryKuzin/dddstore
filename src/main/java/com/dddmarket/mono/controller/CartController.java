package com.dddmarket.mono.controller;

import com.dddmarket.mono.dto.AddProductRequest;
import com.dddmarket.mono.entity.Product;
import com.dddmarket.mono.repository.ProductRepository;
import com.dddmarket.mono.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/cart/add")
    public String addProductToCart(@RequestBody AddProductRequest request) {
        Optional<Product> product = productRepository.findById(request.getProductId());
        if(!product.isPresent()) {
            return "fail";
        }
        return cartService.addProductToCart(product.get()) ? "success" : "fail";
    }
}

