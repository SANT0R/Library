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
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "release_year")
    private String releaseYear;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @Column(name = "page")
    private String page;

    @Column(name = "stock")
    private String stock;

    @OneToOne
    @JoinColumn(name = "client_name")
    private Client client_name;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private Set<Author> author = new HashSet<>();

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
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

    public String getPage()
    {
        return page;
    }

    public void setPage(String page)
    {
        this.page = page;
    }

    public String getStock()
    {
        return stock;
    }

    public void setStock(String stock)
    {
        this.stock = stock;
    }


    public Client getClient_name()
    {
        return client_name;
    }

    public void setClient_name(Client client_name)
    {
        this.client_name = client_name;
    }

    public Set<Author> getAuthor()
    {
        return author;
    }

    public void setAuthor(Set<Author> author)
    {
        this.author = author;
    }

    @Override
    public String toString()
    {
        return "Book [id=" + id + ", name=" + name + ", releaseYear=" + releaseYear + ", type=" + type
                + ", description=" + description + ", client_name=" + client_name + "]";
    }

}
