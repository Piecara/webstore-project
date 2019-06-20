package com.dwsj.webstore.anorderproduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController("/order")
public class AnOrderProductController {
    @Autowired
    AnOrderProductRepository repository;

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(value = "/all")
    public void addAddress(@RequestBody final AnOrderProduct anOrderProduct) {
        repository.save(anOrderProduct);
    }
}
