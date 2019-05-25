package com.dwsj.webstore.product.controller;

import com.dwsj.webstore.product.repository.ProductRepository;
import com.dwsj.webstore.product.service.ProductService;
import com.dwsj.webstore.product.model.Product;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController()
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(value = "/all")
    public List<Product> gap() {
        return productService.findAll();
    }

    @GetMapping(value = "/{name}")
    public Product gpbn(@PathVariable final String name) {
        return productService.findByName(name);
    }

    @GetMapping(value = "/id/{id}")
    public Product gpbi(@PathVariable final int id) {
        return productService.findById(id);
    }

    @GetMapping(value = "/category/{category}")
    public List<Product> gpbc(@PathVariable final String category) {
        return productService.findProductsByCategory(category);
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(value = "/add")
    public Product ap(@RequestBody final Product product) {
        productService.saveProduct(product);
        return productService.findById(product.getId());
    }

    @ResponseStatus(code = HttpStatus.ACCEPTED)
    @DeleteMapping(name = "/delete/{id}")
    public void dp(@PathVariable(value = "id") final Long id) {
        productService.deleteById(id);
    }
}

//data transfer object
