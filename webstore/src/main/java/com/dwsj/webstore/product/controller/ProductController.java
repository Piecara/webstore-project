package com.dwsj.webstore.product.controller;

import com.dwsj.webstore.product.repository.ProductRepository;
import com.dwsj.webstore.product.service.ProductService;
import com.dwsj.webstore.product.model.Product;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController()
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    ProductRepository productRepository;

    @GetMapping(value = "/", consumes = MediaType.ALL_VALUE)
    public List<Product>gap() {
        return productRepository.findAll();
    }

    @GetMapping(value = "/name/{name}")
    public Product gpbn(@PathVariable final String name) {
        return productService.findByName(name);
    }

    @GetMapping(value = "/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
    public Product gpbi(@PathVariable final int id) {
        return productService.findById(id);
    }

    @GetMapping(value = "/category/{category}")
    public List<Product> gpbc(@PathVariable final String category) {
        return productService.findProductsByCategory(category);
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(value = "/", consumes = MediaType.TEXT_PLAIN_VALUE)
    public Product ap(@RequestBody final Product product) {
        productService.saveProduct(product);
        return productService.findById(product.getId());
    }

    @ResponseStatus(code = HttpStatus.ACCEPTED)
    @DeleteMapping(name = "/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
    public void dp(@PathVariable(value = "id") final Long id) {
        productService.deleteById(id);
    }
}

//data transfer object
