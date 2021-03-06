package com.dwsj.webstore.models;


import javax.persistence.*;

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

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", buildingNumber=" + buildingNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
