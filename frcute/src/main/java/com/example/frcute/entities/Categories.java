package com.example.frcute.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="categories")
public class Categories {

    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="categoryid", nullable = false)
    public long categoryID;

    @Column(name="Name", nullable = false)
    private String name;

    public long getIDCategory() {
        return this.categoryID;
    }

    public void setIDCategory(long categoryID) {
        this.categoryID = categoryID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}