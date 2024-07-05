package com.harry.cart_service.service;

import com.harry.cart_service.model.ProductModel;

import java.util.List;

public interface CartService {

    void addProductToCart(ProductModel product);
    void addProductsToCart(List<ProductModel> products);
    int getCartProductCount();
    List<ProductModel> getCartProducts();
}
