package com.dwsj.webstore.anorder.repository;

import com.dwsj.webstore.anorder.model.AnOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface AnOrderRepository extends JpaRepository<AnOrder,Long> {
}
