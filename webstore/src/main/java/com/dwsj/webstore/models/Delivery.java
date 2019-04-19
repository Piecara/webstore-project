package com.dwsj.webstore.models;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_address")
    private Address address;

    @Column(name = "delivery_type")
    private String deliveryType;

/* CAUSING AN ERROR
     @OneToOne(mappedBy="delivery", cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
     private Delivery delivery;


*/
    public Delivery() {
    }

    public Delivery(Address address, String deliveryType) {
        this.address = address;
        this.deliveryType = deliveryType;
    }

/*  CAUSING AN ERROR
    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
*/

}
