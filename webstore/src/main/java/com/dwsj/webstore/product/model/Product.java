package com.dwsj.webstore.product.model;

import com.dwsj.webstore.models.AnOrder;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;


@Entity
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
    private List<AnOrder> anOrders;


    public Product() {
    }

    public Product(String name, int price, String category, String description, int inStock, int sold, List<AnOrder> anOrders) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.inStock = inStock;
        this.sold = sold;
        this.anOrders = anOrders;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", inStock=" + inStock +
                ", sold=" + sold +
                ", anOrders=" + anOrders +
                '}';
    }

    public List<AnOrder> getAnOrders() {
        return anOrders;
    }

    public void setAnOrders(List<AnOrder> anOrders) {
        this.anOrders = anOrders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }
}
