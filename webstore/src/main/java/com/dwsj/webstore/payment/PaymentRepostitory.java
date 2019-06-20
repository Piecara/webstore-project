package com.dwsj.webstore.payment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepostitory extends JpaRepository<Payment,Long> {
}
