package com.dwsj.webstore.services.impl;

import com.dwsj.webstore.models.Product;
import com.dwsj.webstore.repositories.ProductRepository;
import com.dwsj.webstore.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

}
