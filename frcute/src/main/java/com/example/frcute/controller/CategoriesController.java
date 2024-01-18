package com.example.frcute.controller;

import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



import com.example.frcute.services.CategoryService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;



@RestController
@Validated
@RequiredArgsConstructor
public class CategoriesController {
    

    private final CategoryService service;
    @GetMapping("/categories/{id}")
    @Operation(summary = "getCategory(id)", description = "gets a category based on its ID")
    @ApiResponses(value={
            @ApiResponse(responseCode="200",description="Returned successfully"),
            @ApiResponse(responseCode = "4xx",description = "Database not found."),
            @ApiResponse(responseCode = "500",description = "ID not found")
    })
    public ResponseEntity<String> getCategory(@PathVariable int id) {
        return ResponseEntity.ok().body(service.getCategoryID(id).getCategoryID() + " " + service.getCategoryID(id).getName());
}

    
}