package com.example.frcute.controller;

import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



import com.example.frcute.services.CategoryService;

import lombok.RequiredArgsConstructor;



@RestController
@Validated
@RequiredArgsConstructor
public class CategoriesController {
    

    private final CategoryService service;
    @GetMapping("/categories/{id}")
    public ResponseEntity<String> getCategory(@PathVariable int id) {
        return ResponseEntity.ok().body(service.getCategoryID(id).getCategoryID() + " " + service.getCategoryID(id).getName());
}

    
}