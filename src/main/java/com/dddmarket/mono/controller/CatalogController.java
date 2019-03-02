package com.dddmarket.mono.controller;

import com.dddmarket.mono.dto.PageDTO;
import com.dddmarket.mono.entity.Product;
import com.dddmarket.mono.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CatalogController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/products")
    public Page<Product> getProductByPage(@RequestBody PageDTO request) {
        return productRepository.findAll(PageRequest.of(request.getPage(), request.getSize()));
    }

    @GetMapping("/products/all")
    public List<Product> getProductByPage() {
        return productRepository.findAll();
    }

    @PostMapping("/products/new")
    public String saveProduct(@RequestBody Product product) {
        Optional<Product> savedProduct = Optional.ofNullable(productRepository.save(product));

        if(savedProduct.isPresent()) {
            return "success";
        }
        return "fail";
    }
}
