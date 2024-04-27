package com.helloIftekhar.springJwt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helloIftekhar.springJwt.model.Product;
import com.helloIftekhar.springJwt.model.ProductDao;
import com.helloIftekhar.springJwt.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService implements ProductDao {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAllDao() {
        return productRepository.findAll();
    }

    @Override
    public void saveDao(Product product) {
        Product savedProduct = productRepository.save(product);
        if (savedProduct != null) {
            System.out.println("Product saved successfully");
        } 
    }

    @Override
    public void updateDao(Product product) {
        if (productRepository.existsById(product.getIdProduct())) {
            productRepository.save(product);
            System.out.println("Product updated successfully");
        } else {
            System.out.println("Failed to update the product, as it does not exist in the database");
        }
    }

    @Override
    public void deleteDao(Product product) {
        productRepository.delete(product);
        System.out.println("Product deleted successfully");
    }

    @Override
    public Product findIdDao(int id) {
        return productRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }
}
