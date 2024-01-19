package com.example.frcute.services;

import com.example.frcute.entities.Products;
import com.example.frcute.repos.ProductRepository;
import com.example.frcute.services.ProductsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ServiceProductTest {

    @Mock
    private ProductRepository repository;

    @InjectMocks
    private ProductsService service;
    private Products product;

    @BeforeEach
    void init()
    {
        product = new Products();
        product.setProductID(1);
        product.setName("ProductTest");
        product.setPrice(2);
        product.setDescription("this is a test");
        product.setCategoryID(1);
    }




    @Test
    void getSingleProductTest()
    {

       given(repository.findByProductID(1)).willReturn(product);
       Products testProduct = repository.findByProductID(1);
       assertNotNull(testProduct);
       System.out.println(testProduct);
       assertEquals(1, testProduct.getProductID());
       verify(repository, times(1)).findByProductID(1);
    }


}
