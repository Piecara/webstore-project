package com.dwsj.webstore.controllers;

import com.dwsj.webstore.models.Product;
import com.dwsj.webstore.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/products")
public class ProductController {

    /*
    @Autowired
    ProductService productService;


    @RequestMapping(name = "/")
    public List<Product> getProducts(){
        return productService.getAllProducts();
    }
*/



    @Autowired
    ProductRepository productRepository;

    @RequestMapping(name = "/all")
    public List<Product> gap(){
        return productRepository.findAll();
    }

    @RequestMapping("/{category}")
    public List<Product> gpbc(@PathVariable("category") String productCategory){
        return productRepository.findProductsByCategory(productCategory);
    }

    @RequestMapping("/{id}")
    public Product gpbi(@PathVariable("id") long productId){
        return productRepository.findProductById(productId);
    }

}
