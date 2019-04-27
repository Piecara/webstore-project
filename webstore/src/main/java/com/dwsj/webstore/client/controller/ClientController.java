package com.dwsj.webstore.client.controller;

import com.dwsj.webstore.client.model.AnClient;
import com.dwsj.webstore.client.service.ClientService;
import com.nimbusds.jwt.JWTClaimsSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;


@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    ClientService clientService;

   // @GetMapping("/")
    //public List<AnClient> getAllClients(){
    //    return clientService.findAll();
    //}
   @RequestMapping("/any")
   public String helloWorld() {
       return "Hello world!";
   }
    @RequestMapping("/")
   // @PreAuthorize(value = "hasAnyRole()")
    public String helloInstructor(Authentication authentication) {

        JWTClaimsSet claims = (JWTClaimsSet) authentication.getPrincipal();
        String email = (String) claims.getClaim("email");

        return "Hello instructor " + email + "!";
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
