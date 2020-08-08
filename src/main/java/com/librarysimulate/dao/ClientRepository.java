package com.librarysimulate.dao;

/*
import com.librarysimulate.model.Client;

public interface ClientRepository {

    void create(Client client);
}
*/


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.librarysimulate.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer>{

}