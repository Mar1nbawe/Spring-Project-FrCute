package com.example.frcute.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.frcute.entities.Order;
import com.example.frcute.repos.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
    
    private final OrderRepository repository;

    public  Order getOrderID(long id)
    {
        return repository.findByOrderID(id);
    }

    public List<Order> getAllOrders()
    {
        return repository.findAll();
    }
}
