package com.dwsj.webstore.client.repository;


import com.dwsj.webstore.client.model.AnClient;
import com.dwsj.webstore.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface ClientRepository extends JpaRepository<AnClient, Long> {

    AnClient findById(int id);
    List<AnClient> findAll();
    void deleteById(Long id);
    Optional<AnClient>  findAnClientByName(String name);
}
