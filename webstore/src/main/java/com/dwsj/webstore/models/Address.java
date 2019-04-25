package com.dwsj.webstore.models;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
@Getter
@Setter
@ToString
@Entity
@Table(name = "Address")
public class Address {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "building_number")
    private int buildingNumber;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;


    /*
    * dodanie
    * @OneToOne(mappedBy="address", cascade=CascadeType.{type})
    * private AnClient anClient
    * getter/setter
    * spowoduje polaczenie bi-dir hibernate bedzie szukal address'u w klasie AnClient do ktorego sie odnosi
    * */
    public Address() {
    }

    public Address(int buildingNumber, String street, String city, String country) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.country = country;
    }


}
