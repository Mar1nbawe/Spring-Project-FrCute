package com.example.frcute.repos;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.frcute.entities.Categories;
import com.example.frcute.entities.Products;




public interface ProductRepository extends JpaRepository<Products, Integer> { 
  
    Products findByProductID(int productID);

    @Query(value = "SELECT c.name FROM categories c, products p WHERE p.CategoryID = c.categoryid AND p.ProductID = ?1", nativeQuery = true)
    String findCategoryName(int productID);

    List<Products> findAll();
}
