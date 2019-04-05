package com.dwsj.webstore.controllers;

import com.dwsj.webstore.models.Product;
import com.dwsj.webstore.repositories.ProductRepository;
import com.dwsj.webstore.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(name = "/all")
    public List<Product> gap(){
        return productService.getAllProducts();
    }

    @RequestMapping(method = RequestMethod.POST,name = "/add")
    public void ap(@RequestBody Product product){
        productService.addProduct(product);
    }

    @RequestMapping(method = RequestMethod.DELETE, name = "/{id}")
    public void dp(@PathVariable("id") String id){
        productService.deleteProduct(id);
    }




}
//data transfer object