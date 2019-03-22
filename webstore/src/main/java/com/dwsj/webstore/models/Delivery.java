package com.dwsj.webstore.models;

import javax.persistence.*;

@Entity
@Table(name = "Delivery")
public class Delivery {

    @Id
    @Column(name = "id")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_address")
    private Address address;

    @Column(name = "delivery_Type")
    private String deliveryType;

    public Delivery() {
    }

    public Delivery(Address address, String deliveryType) {
        this.address = address;
        this.deliveryType = deliveryType;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "id=" + id +
                ", address=" + address +
                ", deliveryType='" + deliveryType + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }
}
