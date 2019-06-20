package com.dwsj.webstore.anorder.model;

import com.dwsj.webstore.delivery.model.Delivery;
import com.dwsj.webstore.payment.Payment;
import com.dwsj.webstore.product.model.Product;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
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
    private Set<Product> products;


    public AnOrder() {
    }

    public AnOrder(int id) {
        this.id = id;
    }

    public AnOrder(int idClient, Delivery delivery, Payment payment, Set<Product> products) {
        this.idClient = idClient;
        this.delivery = delivery;
        this.payment = payment;
        this.products = products;
    }


    public void addProduct(Product product){
        if(products == null){
            products = new HashSet<>();
        }

        products.add(product);
    }

}
