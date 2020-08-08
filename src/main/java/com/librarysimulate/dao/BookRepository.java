package com.librarysimulate.dao;

/*
import java.util.List;

import com.librarysimulate.model.Book;

public  interface  BookRepository {

    public List<Book> findAll();
    public Book findById(int id);
    void create(Book book);
    Book update(Book book);
    void delete(int id);
}
*/


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.librarysimulate.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{

}