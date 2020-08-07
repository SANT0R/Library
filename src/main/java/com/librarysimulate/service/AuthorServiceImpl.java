package com.librarysimulate.service;
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
