package com.dwsj.webstore.models;

import javax.persistence.*;

@Entity
@Table(name = "An_Client")
public class AnClient {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @OneToOne(cascade = CascadeType.ALL)

    @JoinColumn(name = "id_address")
    private Address address;

    @Column(name = "telephone")
    private String telephone;

    public AnClient() {
    }

    public AnClient(String name, String surname, Address address, String telephone) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "AnClient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + address +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
