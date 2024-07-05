package com.harry.cart_service.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@ToString
public class ProductModel {

    private Long id;
    private String name;
    private double price;

}
