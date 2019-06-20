package com.dwsj.webstore.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController("/payments")
public class PaymentController {
    @Autowired
    PaymentRepostitory repository;

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(value = "/")
    public void addAddress(@RequestBody final Payment payment) {
        repository.save(payment);
    }
}
