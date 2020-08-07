package com.librarysimulate.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.librarysimulate.model.Author;
import com.librarysimulate.model.Client;

@Repository
public class ClientRepositoryImpl implements ClientRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void create(Client client)
    {
        Client clients = new Client();
        //clients.setClient_name(client);

        client.setEnabled(true);
        client.setPassword(passwordEncoder.encode(client.getPassword()));

        entityManager.persist(client);
        entityManager.persist(clients);
    }
}
