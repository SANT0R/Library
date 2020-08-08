package com.librarysimulate.service;

/*
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarysimulate.dao.BookRepository;
import com.librarysimulate.model.Book;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> findBooks()
    {
        return BookRepository.findAll();
    }

    @Override
    public Book findBook(int id)
    {
        return BookRepository.findById(id);
    }

    @Override
    public void createBook(Book book)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void updateBook(Book book)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteBook(int id)
    {
        bookRepository.delete(id);
    }
}
*/

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarysimulate.model.Book;
import com.librarysimulate.dao.BookRepository;
@Service
public class BookServiceImpl {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks() {

        List<Book> BookList = new ArrayList<>();
        bookRepository.findAll().forEach(BookList::add);
        return BookList;
    }
    public Book addBook(Book book) {

        book= bookRepository.save(book);

        return book;
    }

}