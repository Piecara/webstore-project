package com.dwsj.webstore.client.controller;

import com.dwsj.webstore.client.model.AnClient;
import com.dwsj.webstore.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/clients") ////////// sprawdz wszystkie metody Rozkmin jak dodawac Address
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/")
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
