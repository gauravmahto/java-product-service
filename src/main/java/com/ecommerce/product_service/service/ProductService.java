package com.ecommerce.product_service.service;

import com.ecommerce.product_service.entity.Product;

import java.util.List;

public interface ProductService {

    Product createProduct(Product product);
    Product getProduct(Long id);
    List<Product> getAllProducts();

}
