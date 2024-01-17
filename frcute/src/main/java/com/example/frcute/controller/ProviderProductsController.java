package com.example.frcute.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;


import com.example.frcute.services.ProviderProductsService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@Validated
@RequiredArgsConstructor
public class ProviderProductsController {
    
    private final ProviderProductsService service;
    @GetMapping("/products/provider/{id}")
public ResponseEntity<String> getProductsProvider(@PathVariable int id) {
        return ResponseEntity.ok().body(service.getProductsFromProvider(id).toString());
    }
    
}
