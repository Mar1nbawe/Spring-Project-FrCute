package com.example.frcute.controller;

import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.example.frcute.services.ProductsService;

import org.springframework.validation.annotation.Validated;

import lombok.RequiredArgsConstructor;

@RestController
@Validated
@RequiredArgsConstructor
public class ProductsController {
    
    private final ProductsService service;
    @GetMapping("/products/{id}")
public ResponseEntity<String> getProducts(@PathVariable int id) {
return ResponseEntity.ok().body(service.getProductID(id).getProductID() + " " + service.getProductID(id).getName() + " | " + service.getProductID(id).getPrice() + " | " + service.getCategoryName(id));

}
}
