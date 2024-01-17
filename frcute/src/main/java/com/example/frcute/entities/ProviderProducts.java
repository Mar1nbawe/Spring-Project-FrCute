package com.example.frcute.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ProviderProducts {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int providerid;

    @ManyToOne
    @JoinColumn(name = "productid", referencedColumnName = "ProductID")
    private Products productid;
}
