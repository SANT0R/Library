package com.librarysimulate.dao;

import com.librarysimulate.model.Author;

import java.util.List;

public interface AuthorRepository {

    public List<Author> findAll();
    public Author findById(int id);
    void create(Author author);
    Author update(Author author);
    void delete(int id);
}
