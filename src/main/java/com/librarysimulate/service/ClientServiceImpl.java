package com.librarysimulate.service;

/*
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
*/


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarysimulate.model.Client;
import com.librarysimulate.dao.ClientRepository;
@Service
public class ClientServiceImpl {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAllClient() {

        List<Client> ClientList = new ArrayList<>();
        clientRepository.findAll().forEach(ClientList::add);
        return ClientList;
    }
    public Client addClient(Client client) {

        client= clientRepository.save(client);

        return client;
    }

}