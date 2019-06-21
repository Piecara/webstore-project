package com.dwsj.webstore.delivery.controller;

import com.dwsj.webstore.delivery.model.Delivery;
import com.dwsj.webstore.delivery.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController("/deliveries/")
public class DeliveryController {

    @Autowired
    DeliveryRepository repository;

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping("/add/deli")
    public void addDelivery(@RequestBody final Delivery delivery) {
        repository.save(delivery);
    }
}
