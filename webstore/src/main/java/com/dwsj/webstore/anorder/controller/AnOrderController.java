package com.dwsj.webstore.anorder.controller;

import com.dwsj.webstore.anorder.model.AnOrder;
import com.dwsj.webstore.anorder.repository.AnOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController("/anorders")
public class AnOrderController {

    @Autowired
    AnOrderRepository repository;

}