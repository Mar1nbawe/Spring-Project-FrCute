package com.example.frcute.repos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.example.frcute.entities.Customers;

public interface CustomersRepository extends JpaRepository<Customers, Integer> {
    
 
    Customers findBycustomerID(int customerID);

    List<Customers> findAll();
}
