package com.dwsj.webstore.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "An_Order_Product")
public class AnOrderProduct {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "id_anOrder")
    private int idOrder;

    @Column(name = "id_product")
    private int idProduct;


    public AnOrderProduct() {
    }

    public AnOrderProduct(int idOrder, int idProduct) {
        this.idOrder = idOrder;
        this.idProduct = idProduct;
    }

    @Override
    public String toString() {
        return "AnOrderProduct{" +
                "id=" + id +
                ", idOrder=" + idOrder +
                ", idProduct=" + idProduct +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
}
