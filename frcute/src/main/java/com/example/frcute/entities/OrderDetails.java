package com.example.frcute.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orderdetails")
public class OrderDetails {

    @Id
    private long detailID;

    @Column(name="OrderID", nullable = false)
    private int orderID;

    @Column(name="ProductID", nullable = false)
    private int productID;

    @Column(name="Quantity", nullable = false)
    private int quantity;

    public long getDetailID() {
        return this.detailID;
    }

    public void setDetailID(long detailID) {
        this.detailID = detailID;
    }

    public int getOrderID() {
        return this.orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return this.productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}