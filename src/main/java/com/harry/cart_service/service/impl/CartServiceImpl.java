package com.harry.cart_service.service.impl;

import com.harry.cart_service.model.ProductModel;
import com.harry.cart_service.repository.CartReposiotry;
import com.harry.cart_service.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartReposiotry reposiotry;

    @Override
    public void addProductToCart(ProductModel product) {
        this.reposiotry.addProductToCart(product);
    }

    @Override
    public void addProductsToCart(List<ProductModel> products) {
        this.reposiotry.addProductsToCart(products);
    }

    @Override
    public int getCartProductCount() {
        return this.reposiotry.getCartProductCount();
    }

    @Override
    public List<ProductModel> getCartProducts() {
        List<ProductModel> list = this.reposiotry.getCartProducts();
        for(ProductModel model : list) {
            System.out.println(model);
        }
        return list;
    }
}
