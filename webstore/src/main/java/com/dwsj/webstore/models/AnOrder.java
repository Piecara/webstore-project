package com.dwsj.webstore.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "An_Order")
public class AnOrder {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "id_client")
    private int idClient;

    @Column(name = "id_delivery")
    private int idDelivery;

    @Column(name = "id_payment")
    private int idPayment;


    public AnOrder() {
    }

    public AnOrder(int idClient, int idDelivery, int idPayment) {
        this.idClient = idClient;
        this.idDelivery = idDelivery;
        this.idPayment = idPayment;
    }

    @Override
    public String toString() {
        return "AnOrder{" +
                "id=" + id +
                ", idClient=" + idClient +
                ", idDelivery=" + idDelivery +
                ", idPayment=" + idPayment +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdDelivery() {
        return idDelivery;
    }

    public void setIdDelivery(int idDelivery) {
        this.idDelivery = idDelivery;
    }

    public int getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }
}
