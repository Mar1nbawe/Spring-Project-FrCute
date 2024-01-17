package com.example.frcute.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.frcute.entities.Providers;
import com.example.frcute.repos.ProvidersRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProvidersService {
    
    private final ProvidersRepository repository;

    public  Providers getProvider(int id)
    {
        return repository.findByid(id);
    }

    public List<Providers> getAllProviders()
    {
        return repository.findAll();
    }
}
