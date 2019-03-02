package com.dddmarket.mono.service;

import com.dddmarket.mono.entity.Order;
import com.dddmarket.mono.entity.Product;
import com.dddmarket.mono.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CartService {

    private BigDecimal summ;
    private List<String> products;
    private ProductRepository productRepository;


    @Autowired
    public CartService(ProductRepository productRepository) {
        products = new ArrayList<>();
        summ = BigDecimal.ZERO;
        this.productRepository = productRepository;
    }

    public boolean addProductToCart(Product product) {
        products.add(product.getId());
        summ = summ.add(product.getPrice());
        return true;
    }

    public Order createOrder(String mail) {
        if(mail == null) {
            return null;
        }
        return new Order(
                String.valueOf(System.currentTimeMillis()),
                mail,
                summ,
                products
        );
    }
}
