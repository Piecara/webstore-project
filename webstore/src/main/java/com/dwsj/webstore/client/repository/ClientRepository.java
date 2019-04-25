package com.dwsj.webstore.client.repository;


import com.dwsj.webstore.client.model.AnClient;
import com.dwsj.webstore.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ClientRepository extends JpaRepository<AnClient, Long> {

    AnClient findById(int id);
    List<AnClient> findAll();
    void deleteById(Long id);
}
