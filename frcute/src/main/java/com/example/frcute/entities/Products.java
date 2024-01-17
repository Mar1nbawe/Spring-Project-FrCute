package com.example.frcute.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productID;

    @Column(name="Name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "CategoryID", nullable = false, referencedColumnName = "categoryid")
    private Categories categoryID;

    @Column(name="Price", nullable = false)
    private double price;

    @Column(name="Description", nullable = false)
    private String description;
    



    public int getProductID() {
        return this.productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCategoryID() {
        return this.categoryID.getCategoryID();
    }

    public void setCategoryID(int categoryID) {
        this.categoryID.getCategoryID();
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
