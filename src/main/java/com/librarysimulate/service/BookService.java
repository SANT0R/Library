package com.librarysimulate.service;

import java.util.List;

import com.librarysimulate.model.Book;

public interface BookService {


    public List<Book> findMovies();
    public Book findMovie(int id);
    void createMovie(Book book);
    void updateMovie(Book book);
    void deleteMovie(int id);
}
