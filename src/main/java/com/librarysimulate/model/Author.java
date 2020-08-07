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
    @Column(name = "author_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int author_id;

    @OneToOne(cascade = CascadeType.ALL)

    @OneToMany(mappedBy = "author")
    private Set<Book> books = new HashSet<>();

    public int getAuthor_id()
    {
        return author_id;
    }

    public void setAuthor_id(int author_id)
    {
        this.author_id = author_id;
    }

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
        return "Author [author_id=" + author_id + "author=" + author  + "]";
    }
}
