package com.librarysimulate.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "author")
public class Author  implements Serializable{
    private static final long serialVersionUID = 1L;

    @Column(name ="author")
    private String author;

    @Id
    @OneToOne(cascade = CascadeType.ALL)

    @OneToMany(mappedBy = "author")
    private Set<Book> books = new HashSet<>();

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public Set<Book> getBooks()
    {
        return books;
    }

    public void setBook(Set<Book> books)
    {
        this.books = books;
    }


    @Override
    public String toString()
    {
        return "Author [author=" + author  + "]";
    }
}
