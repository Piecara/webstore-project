package com.dwsj.webstore.product.service;

import com.dwsj.webstore.product.model.Product;
import com.dwsj.webstore.product.repository.ProductRepository;
import com.dwsj.webstore.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    ProductRepository productRepository;


    @Override
    public void updateProd(int id) {
        Product product = productRepository.findById(id);
        int decreaseStock = product.getInStock() - 1;
        product.setInStock(decreaseStock);
        productRepository.save(product);
    }
    @Override
    public void updateProdAmount(int id, int amount) {
        Product product = productRepository.findById(id);
        int decreaseStock = product.getInStock() - amount;
        product.setInStock(decreaseStock);
        productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public Product findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public List<Product> findProductsByCategory(String category) {
        return productRepository.findProductsByCategory(category);
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

}
