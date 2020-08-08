package com.librarysimulate.service;

import java.util.List;

import com.librarysimulate.model.Book;

public interface BookService {


    public List<Book> findBooks();
    public Book findBook(int book_id);
    void createBook(Book book);
    void updateBook(Book book);
    void deleteBook(int book_id);
}
