package com.librarysimulate.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name ="rent")
public class Rent {

    @Id
    @Column(name = "rent_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rent_id;

    @Column(name = "start_date")
    private String start_date;

    @Column(name = "finish_date")
    private String finish_date;

    @Column(name = "remaining_day")
    private int remaining_day;

    @Column(name = "page_sum")
    private int page_sum;

    @OneToMany(mappedBy = "rent_id")
    private Set<Book> books = new HashSet<>();

    @OneToOne(mappedBy = "rent_id")
    private Set<Client> client = new HashSet<>();

    public int getRent_id()
    {
        return rent_id;
    }

    public void setRent_id(int rent_id)
    {
        this.rent_id = rent_id;
    }

    public String getStart_date()
    {
        return start_date;
    }

    public void setStart_date(String start_date)
    {
        this.start_date = start_date;
    }

    public String getFinish_date()
    {
        return finish_date;
    }

    public void setFinish_date(String finish_date)
    {
        this.finish_date = finish_date;
    }

    public int getRemaining_day()
    {
        return remaining_day;
    }

    public void setRemaining_day(int remaining_day)
    {
        this.remaining_day = remaining_day;
    }

    public int getPage_sum()
    {
        return page_sum;
    }

    public void setPage_sum(int page_sum)
    {
        this.page_sum = page_sum;
    }

    public Set<Book> getBooks()
    {
        return books;
    }

    public void setBooks(Set<Book> books)
    {
        this.books = books;
    }

    public Set<Client> getClient()
    {
        return client;
    }

    public void setClient(Set<Client> client)
    {
        this.client = client;
    }

    @Override
    public String toString()
    {
        return "Rent [rent_id=" + rent_id  + ", start_date=" + start_date + ", finish_date=" + finish_date
                + ", remaining_day=" + remaining_day + ", page_sum=" + page_sum + ", books=" + books +
                ", client=" + client + "]";
    }


}
