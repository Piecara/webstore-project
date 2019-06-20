package com.dwsj.webstore.client.model;

import com.dwsj.webstore.address.model.Address;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
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


    public AnClient(AnClient client){
        this.id = client.id;
        this.name = client.name;
        this.surname = client.surname;

        this.address = new Address(client.getAddress().getId(),
                                   client.getAddress().getBuildingNumber(),
                                   client.getAddress().getStreet(),
                                   client.getAddress().getCity(),
                                   client.getAddress().getCountry());
        this.telephone = client.telephone;
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
