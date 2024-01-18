package com.example.frcute.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customers")
public class Customers {

     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int customerID;

    @Column(name="FirstName", nullable = false)
    private String firstName;

    @Column(name="LastName", nullable = false)
    private String lastName;

    @Column(name="Email", nullable = false)
    private String email;

    public int getId() {
        return this.customerID;
    }

    public void setId(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}