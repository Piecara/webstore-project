package com.dwsj.webstore.product.service;

import com.dwsj.webstore.product.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ProductService {
    List<Product> getAllProducts();
    void addProduct(Product product);
    void deleteProduct(String id);
}

