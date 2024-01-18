package com.example.frcute.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.frcute.entities.Products;
import com.example.frcute.repos.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductsService {
    
    private final ProductRepository repository;

    public  Products getProductID(int id)
    {
        return repository.findByProductID(id);
    }

    public  String getCategoryName(int id)
    {
        return repository.findCategoryName(id);
    }

    public List<Products> getAllProducts()
    {
        return repository.findAll();
    }

    public Products addProducts(String name, int price, long categoryID)
    {
        Products product = new Products();
        product.setName(name);
        product.setPrice(price);
        product.setCategoryID(categoryID);
        System.out.println(name);
        return repository.save(product);
    }
}
