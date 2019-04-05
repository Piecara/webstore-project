package com.dwsj.webstore.product.controller;

import com.dwsj.webstore.product.service.ProductService;
import com.dwsj.webstore.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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