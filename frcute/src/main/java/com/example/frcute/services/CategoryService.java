package com.example.frcute.services;



import java.util.List;

import org.springframework.stereotype.Service;

import com.example.frcute.entities.Categories;
import com.example.frcute.repos.CategoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryService {
    
    private final CategoryRepository repository;

    public  Categories getCategoryID(int id)
    {
        return repository.findBycategoryID(id);
    }

    public List<Categories> getAllCategories()
    {
        return repository.findAll();
    }
}
