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

    public Customers addCustomer(String first, String last, String mail)
    {
        Customers customer = new Customers();
        customer.setFirstName(first);
        customer.setLastName(last);
        customer.setEmail(mail);
        return repository.save(customer);
        
    }
}
