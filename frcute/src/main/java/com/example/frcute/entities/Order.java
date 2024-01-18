package com.example.frcute.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

     @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int orderID;

    @Column (name="CustomerID", nullable = false)
    private int customerID;

    @ManyToOne
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID")
    private Products ProductID;

    /* @ManyToOne
    @JoinColumn(name = "CustomerID", referencedColumnName = "customerID") */

    public int getOrderID() {
        return this.orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCustomerID() {
        return this.customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }


    public Products getProductID() {
        return this.ProductID;
    }

    public void setProductID(Products ProductID) {
        this.ProductID = ProductID;
    }
}
