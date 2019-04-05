package com.dwsj.webstore.models;

import com.dwsj.webstore.product.model.Product;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "An_Order")
public class AnOrder {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "id_client")
    private int idClient;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_delivery")
    private Delivery delivery;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_payment")
    private Payment payment;


    //@OneToMany(mappedBy = "anOrder")
    //private List<AnOrderProduct> anOrderProducts;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinTable(
            name = "An_Order_Product",
            joinColumns = @JoinColumn(name = "id_anOrder"),
            inverseJoinColumns = @JoinColumn(name = "id_product"))
    private List<Product> products;


    public AnOrder() {
    }

    public AnOrder(int idClient, Delivery delivery, Payment payment, List<Product> products) {
        this.idClient = idClient;
        this.delivery = delivery;
        this.payment = payment;
        this.products = products;
    }

    @Override
    public String toString() {
        return "AnOrder{" +
                "id=" + id +
                ", idClient=" + idClient +
                ", delivery=" + delivery +
                ", payment=" + payment +
                ", products=" + products +
                '}';
    }

    public void addProduct(Product product){
        if(products == null){
            products = new ArrayList<>();
        }

        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

  //  public List<AnOrderProduct> getAnOrderProducts() {
  //      return anOrderProducts;
  //  }

  //  public void setAnOrderProducts(List<AnOrderProduct> anOrderProducts) {
  //      this.anOrderProducts = anOrderProducts;
  // }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
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


}
