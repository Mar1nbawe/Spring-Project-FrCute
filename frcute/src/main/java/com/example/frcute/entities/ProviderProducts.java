package com.example.frcute.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="providerproducts")
public class ProviderProducts {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int providerid;

    @Column(name="productid", nullable = false)
    private int productid;

    public int getProviderid() {
        return providerid;
    }

    public void setProviderid(int providerid) {
        this.providerid = providerid;
    }

    public long getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }
}

    
