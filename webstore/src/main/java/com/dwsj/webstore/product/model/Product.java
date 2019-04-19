package com.dwsj.webstore.product.model;

import com.dwsj.webstore.models.AnOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@EqualsAndHashCode
@Table(name = "Product")
public class Product {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "category")
    private String category;

    @Column(name = "description")
    private String description;

    @Column(name = "in_stock")
    private int inStock;

    @Column(name = "sold")
    private int sold;

    @JsonIgnore
    @ManyToMany(mappedBy = "products")
    private Set<AnOrder> anOrders = new HashSet<>();


    public Product() {
    }

    public Product(String name, int price, String category, String description, int inStock, int sold, Set<AnOrder> anOrders) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.inStock = inStock;
        this.sold = sold;
        this.anOrders = anOrders;
    }
}
