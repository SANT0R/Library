package com.librarysimulate.dao;


import java.util.List;

import com.librarysimulate.model.Book;

public  interface  BookRepository {

    public List<Book> findAll();
    public Book findById(int id);
    void create(Book book);
    Book update(Book book);
    void delete(int id);
}
