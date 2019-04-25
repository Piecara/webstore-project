package com.dwsj.webstore.client.service;

import com.dwsj.webstore.client.model.AnClient;
import com.dwsj.webstore.client.repository.ClientRepository;
import jdk.internal.org.objectweb.asm.ClassReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    ClientRepository repository;

    @Override
    public AnClient findById(int id) {
        return repository.findById(id);
    }

    @Override
    public List<AnClient> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void saveClient(AnClient client) {
        repository.save(client);
    }
}
