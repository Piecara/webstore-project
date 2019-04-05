package com.dwsj.webstore.product.repository;

import com.dwsj.webstore.product.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {

    Product findProductById(long id);

    /*
    @Query("SELECT p FROM Product p")
    List<Product> findAll();

    @Query(value = "SELECT p FROM Product p WHERE p.category like ?1")
    List<Product> findProductsByCategory(String category);

    Product findProductById(long id);
*/
}
