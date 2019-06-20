package com.dwsj.webstore.address.repository;

import com.dwsj.webstore.address.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AddressRepository extends JpaRepository<Address,Long > {
}