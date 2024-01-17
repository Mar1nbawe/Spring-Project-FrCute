package com.example.frcute.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.frcute.entities.ProviderProducts;

public interface ProviderProductsRepository extends JpaRepository<ProviderProducts, Integer> {
    
    ProviderProducts findByProviderid(int provider_id);

    @Query(value = "SELECT p.Name FROM products p, providerproducts pp WHERE p.productID = pp.productid AND pp.providerid = ?1", nativeQuery = true)
    List<String> findProductNameByProviderId(int providerId);

    List<ProviderProducts> findAll();
}
