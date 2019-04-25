package com.dwsj.webstore.client.service;

import com.dwsj.webstore.client.model.AnClient;
import com.dwsj.webstore.client.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {


    AnClient findById(int id);
    List<AnClient> findAll();
    void deleteById(Long id);
    void saveClient(AnClient client);
}
