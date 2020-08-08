package com.librarysimulate.service;

/*
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarysimulate.dao.AuthorRepository;
import com.librarysimulate.model.Author;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public void createAuthor(Author author)
    {
        authorRepository.create(author);
    }
}
*/


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarysimulate.model.Author;
import com.librarysimulate.dao.AuthorRepository;
@Service
public class AuthorServiceImpl {

    @Autowired
    AuthorRepository authorRepository;

    public List<Author> getAllAuthors() {

        List<Author> AuthorList = new ArrayList<>();
        authorRepository.findAll().forEach(AuthorList::add);
        return AuthorList;
    }
    public Author addAuthor(Author author) {

        author= authorRepository.save(author);

        return author;
    }

}