package com.example.frcute.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.frcute.entities.Categories;

public interface CategoryRepository extends JpaRepository<Categories, Integer> {
    
    Categories findBycategoryID(int categoryID);

    List<Categories> findAll();
}
