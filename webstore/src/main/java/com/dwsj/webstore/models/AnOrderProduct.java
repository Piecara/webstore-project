package com.dwsj.webstore.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
@Getter
@Setter
@ToString
@Entity
@Table(name = "An_Order_Product")
public class AnOrderProduct {

    @Id
    @Column(name = "id")
    private int id;

  //  @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH, CascadeType.PERSIST,CascadeType.REFRESH})
  //  @JoinColumn(name = "id")
  //  private AnOrder anOrder;

    @Column(name = "id_anOrder")
    private  int idAnOrder;

    @Column(name = "id_product")
    private int idProduct;

    public AnOrderProduct() {
    }

    public AnOrderProduct(int idAnOrder, int idProduct) {
        this.idAnOrder = idAnOrder;
        this.idProduct = idProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAnOrder() {
        return idAnOrder;
    }

    public void setIdAnOrder(int idAnOrder) {
        this.idAnOrder = idAnOrder;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
}
