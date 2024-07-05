package com.harry.cart_service.repository;

import com.harry.cart_service.model.ProductModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class CartReposiotry {

    private static final List<ProductModel> CART_PRODUCTS = new ArrayList<>();

    public void addProductToCart(ProductModel product) {
        CART_PRODUCTS.add(product);
    }

    public void addProductsToCart(List<ProductModel> products) {
        CART_PRODUCTS.addAll(products);
    }

    public int getCartProductCount() {
        return CART_PRODUCTS.size();
    }

    public List<ProductModel> getCartProducts() {
        return CART_PRODUCTS;
    }

}
