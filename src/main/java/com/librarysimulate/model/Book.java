package com.librarysimulate.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int book_id;

    @Column(name = "name")
    private String name;

    @Column(name = "release_year")
    private String releaseYear;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @Column(name = "page")
    private int page;

    @Column(name = "stock")
    private int stock;

    @OneToOne(mappedBy = "book", cascade = CascadeType.ALL)
    private Set<Author> author = new HashSet<>();

    @OneToMany(mappedBy = "book_id")
    private Set<Rent> rents = new HashSet<>();

    public int getBook_id()
    {
        return book_id;
    }

    public void setBook_id(int book_id)
    {
        this.book_id = book_id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getReleaseYear()
    {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear)
    {
        this.releaseYear = releaseYear;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getPage()
    {
        return page;
    }

    public void setPage(int page)
    {
        this.page = page;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }

    public Set<Author> getAuthor()
    {
        return author;
    }

    public void setAuthor(Set<Author> author)
    {
        this.author = author;
    }

    public Set<Rent> getRents()
    {
        return rents;
    }

    public void setRent(Set<Rent> rents)
    {
        this.rents = rents;
    }

    @Override
    public String toString()
    {
        return "Book [book_id=" + book_id + ", name=" + name + ", releaseYear=" + releaseYear + ", type=" + type
                + ", description=" + description + ", page=" + page + ", stock=" + stock + "]";
    }

}
