package com.example.frcute.repos;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.frcute.entities.Categories;
import com.example.frcute.entities.Products;

import lombok.RequiredArgsConstructor;




public interface ProductRepository extends JpaRepository<Products, Integer> { 
  
    Products findByProductID(long categoryID);

    @Query(value = "SELECT c.name FROM categories c, products p WHERE p.CategoryID = c.categoryid AND p.ProductID = ?1", nativeQuery = true)
    String findCategoryName(long productID);

    List<Products> findAll();
}
