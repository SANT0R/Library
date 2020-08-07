package com.librarysimulate.service;

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
    public List<Book> findMovies()
    {
        return bookRepository.findAll();
    }

    @Override
    public Book findMovie(int id)
    {
        return bookRepository.findById(id);
    }

    @Override
    public void createMovie(Book book)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void updateMovie(Book book)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteMovie(int id)
    {
        bookRepository.delete(id);
    }
}
