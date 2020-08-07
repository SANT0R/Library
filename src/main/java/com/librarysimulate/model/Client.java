package com.librarysimulate.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="client")
public class Client {

    @Id
    @Column(name = "client_name")
    private String client_name;

    @Column(name = "password")
    private String password;

    @Column(name = "enabled")
    private boolean enabled;

    @OneToMany(mappedBy = "client_name")
    private Set<Book> books = new HashSet<>();


    public String getClient_name()
    {
        return client_name;
    }

    public void setClient_name(String client_name)
    {
        this.client_name = client_name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public boolean isEnabled()
    {
        return enabled;
    }

    public void setEnabled(boolean enabled)
    {
        this.enabled = enabled;
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
        return "Client [client_name=" + client_name + ", password=" + password + ", enabled=" + enabled + "]";
    }
}
