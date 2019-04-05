package com.dwsj.webstore.services;

import com.dwsj.webstore.models.Product;
import com.dwsj.webstore.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ProductService {
    List<Product> getAllProducts();
    void addProduct(Product product);
    void deleteProduct(String id);
}

