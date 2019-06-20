package com.dwsj.webstore.address.controller;


import com.dwsj.webstore.address.model.Address;
import com.dwsj.webstore.address.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController("/addresses")
public class AddressController {

    @Autowired
    AddressRepository repository;

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(value = "//")
    public void addAddress(@RequestBody final Address address) {
        repository.save(address);
    }
}
