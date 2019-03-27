package com.dwsj.webstore.repositories;

import com.dwsj.webstore.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p")
    List<Product> findAll();

    @Query(value = "SELECT p FROM Product p WHERE p.category like ?1")
    List<Product> findProductsByCategory(String category);

    Product findProductById(long id);
}
