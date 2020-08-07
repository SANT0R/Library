package com.librarysimulate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.librarysimulate.model.Author;

@Repository
public class AuthorRepositoryImpl implements AuthorRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Author> findAll()
    {
        return entityManager.createQuery("from Author", Author.class).getResultList();
    }

    @Override
    public Author findById(int id)
    {
        return entityManager.find(Author.class, id);
    }

    @Override
    public void create(Author author) {


    }

    @Override
    public Author update(Author author) {

        return null;
    }

    @Override
    public void delete(int id) {

        entityManager.remove(entityManager.getReference(Author.class, id));
    }
}
