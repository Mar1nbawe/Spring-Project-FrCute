package com.example.frcute.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.frcute.entities.ProviderProducts;
import com.example.frcute.repos.ProviderProductsRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProviderProductsService {
    
    private final ProviderProductsRepository repository;

    public  ProviderProducts getProviderProductsID(int id)
    {
        return repository.findByProviderid(id);
    }

    public List<String> getProductsFromProvider(int id)
    {
        return repository.findProductNameByProviderId(id);
    }

    List<ProviderProducts> getProviderProducts()
    {
        return repository.findAll();
    }
}
