package com.example.frcute.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.frcute.entities.Products;
import com.example.frcute.repos.CategoryRepository;
import com.example.frcute.repos.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductsService {
    
    private final ProviderProductsService providerProductsService;

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

    public Products addProducts(String name, int price, long categoryID, String description)
    {   
        Products product = new Products();
        product.setName(name);
        product.setPrice(price);
        product.setCategoryID(categoryID);
        product.setDescription(description);
        return repository.save(product);
    }

    public String deleteProducts(int id) {
       
        if(repository.findById(id).isPresent())
        {
         repository.deleteById(id);
         return "Product deleted";
        }
        else return "Product not found";
    }
}
