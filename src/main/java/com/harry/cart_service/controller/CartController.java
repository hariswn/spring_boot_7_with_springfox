package com.harry.cart_service.controller;

import com.harry.cart_service.model.ProductModel;
import com.harry.cart_service.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carts")
public class CartController {

    @Autowired
    private CartService service;

    @PostMapping("/product")
    public void addProductToCart(@RequestBody ProductModel product) {
        this.service.addProductToCart(product);
    }

    @PostMapping("/products")
    public void addProductsToCart(@RequestBody List<ProductModel> products) {
        this.service.addProductsToCart(products);
    }

   @GetMapping("/size")
    public int getCartProductCount() {
        return this.service.getCartProductCount();
    }

   @GetMapping("/all")
    public List<ProductModel> getCartProducts() {
        return this.service.getCartProducts();
    }
}
