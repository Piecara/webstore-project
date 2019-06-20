package com.dwsj.webstore.client.controller;

import com.dwsj.webstore.client.model.AnClient;
import com.dwsj.webstore.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/")
   // @PreAuthorize("hasAnyRole('ADMIN')")
    public List<AnClient> getAllClients(){
        return clientService.findAll();
    }

    @GetMapping("/id/{id}")
    public AnClient getClientById(@PathVariable(value = "id") final int id){
        return clientService.findById(id);
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(value = "/create/")
    public void addClient(@RequestBody final AnClient client) {
        clientService.saveClient(client);
    }

    @ResponseStatus(code = HttpStatus.ACCEPTED)
    @DeleteMapping(name = "/delete/{id}")
    public void deleteClient(@PathVariable(value = "id") final Long id) {
        clientService.deleteById(id);
    }

}
