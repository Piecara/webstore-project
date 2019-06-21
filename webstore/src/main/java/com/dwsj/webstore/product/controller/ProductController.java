package com.dwsj.webstore.product.controller;

import com.dwsj.webstore.client.model.AnClient;
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


/**
 * kontroler pozwalajacy na operacje crud dla produktu
 */
@RestController()
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    ProductRepository productRepository;

    @GetMapping(value = "/", consumes = MediaType.ALL_VALUE)
    public List<Product>gap() {
        return productService.findAll();
    }

    @GetMapping(value = "/name/{name}")
    public Product gpbn(@PathVariable final String name) {
        return productService.findByName(name);
    }

    @GetMapping(value = "/{id}")
    public Product gpbi(@PathVariable final int id) {
        return productService.findById(id);
    }

    @GetMapping(value = "/category/{category}")
    public List<Product> gpbc(@PathVariable final String category) {
        return productService.findProductsByCategory(category);
    }

    @PatchMapping(value = "/update/{id}")
    public void updateProduct(@PathVariable final int id){
        productService.updateProd(id);
    }
    @PatchMapping(value = "/update/{id}/{amount}")
    public void updateProduct(@PathVariable(value = "id") final int id, @PathVariable(value = "amount") final int amount){
        productService.updateProdAmount(id,amount);
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(value = "/", consumes = MediaType.ALL_VALUE)
    public void  ap(@RequestBody final Product product) {
        productService.saveProduct(product);
    }

    @ResponseStatus(code = HttpStatus.ACCEPTED)
    @DeleteMapping(name = "/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
    public void dp(@PathVariable(value = "id") final Long id) {
        productService.deleteById(id);
    }
}

//data transfer object
