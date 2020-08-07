package com.librarysimulate.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarysimulate.dao.ClientRepository;
import com.librarysimulate.model.Client;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public void createClient(Client client) {

        clientRepository.create(client);
    }
}
