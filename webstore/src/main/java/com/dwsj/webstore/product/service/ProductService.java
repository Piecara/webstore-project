package com.dwsj.webstore.product.service;

import com.dwsj.webstore.product.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ProductService {
    Product findById(int id);
    Product findByName(String name);
    List<Product> findProductsByCategory(String category);
    void saveProduct(Product product);
    List<Product> findAll();
    void deleteById(Long id);
}

