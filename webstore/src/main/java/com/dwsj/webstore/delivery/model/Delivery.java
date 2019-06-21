package com.dwsj.webstore.delivery.model;

import com.dwsj.webstore.address.model.Address;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
@Getter
@Setter
@ToString
@Entity
@Table(name = "Delivery")
public class Delivery {

    @Id
    @Column(name = "id")
    private int id;

    @OneToOne()
    @JoinColumn(name = "id_address")
    private Address address;

    @Column(name = "delivery_type")
    private String deliveryType;

    public Delivery() {
    }



}
