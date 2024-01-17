package com.example.frcute.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.frcute.entities.Customers;
import com.example.frcute.repos.CustomersRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomersService {
    
    private final CustomersRepository repository;

    public  Customers getCustomer(int id)
    {
        return repository.findBycustomerID(id);
    }

    public List<Customers> getAllCustomers()
    {
        return repository.findAll();
    }
}
