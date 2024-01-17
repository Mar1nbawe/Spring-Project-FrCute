package com.example.frcute.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.frcute.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> { 
  

   Order findByOrderID(Long orderID); 

   List<Order> findAll();  
  
}