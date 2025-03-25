package com.ecommerce.product_service.service;

import com.ecommerce.product_service.entity.Product;
import com.ecommerce.product_service.exception.InsufficientQuantityException;
import com.ecommerce.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    /**
     * @param product
     * @return
     */
    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found " + id));
    }

    /**
     * @return
     */
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    @Transactional
    public Product reduceQuantity(Long id, int quantity) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        if (product.getQuantity() < quantity) {
            throw new InsufficientQuantityException("Insufficient product quantity!");
        }

        product.setQuantity(product.getQuantity() - quantity);
        return productRepository.save(product);
    }
}
