package com.example.frcute.repos;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.frcute.entities.Providers;

public interface ProvidersRepository extends JpaRepository<Providers, Integer> {
    
    
    Providers findByid(int id);

    List<Providers> findAll();
}
