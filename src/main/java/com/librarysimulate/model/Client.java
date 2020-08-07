package com.librarysimulate.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name ="client")
public class Client {

    @Id
    @Column(name = "client_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int client_id;

    @Column(name = "client_name")
    private String client_name;

    @Column(name = "password")
    private String password;

    @Column(name = "enabled")
    private boolean enabled;

    @OneToMany(mappedBy = "client_id")
    private Set<Rent> rents = new HashSet<>();


    public int getClient_id()
    {
        return client_id;
    }

    public void setClient_id(int client_id)
    {
        this.client_id = client_id;
    }

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
        return "Client [client_id=" + client_id + "client_name=" + client_name + ", password=" + password + ", enabled=" + enabled + "]";
    }
}
