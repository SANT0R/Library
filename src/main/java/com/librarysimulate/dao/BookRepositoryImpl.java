package com.librarysimulate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.librarysimulate.model.Book;

@Repository
public class BookRepositoryImpl implements BookRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Book> findAll()
    {
        return entityManager.createQuery("from Book", Book.class).getResultList();
    }

    @Override
    public Book findById(int id)
    {
        return entityManager.find(Book.class, id);
    }

    @Override
    public void create(Book book)
    {

    }

    @Override
    public Book update(Book book)
    {
        return null;
    }

    @Override
    public void delete(int id)
    {
        entityManager.remove(entityManager.getReference(Book.class, id));
    }
}
