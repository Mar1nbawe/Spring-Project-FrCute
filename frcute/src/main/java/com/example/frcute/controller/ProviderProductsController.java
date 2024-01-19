package com.example.frcute.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;


import com.example.frcute.services.ProviderProductsService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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
    @Operation(summary = "getProductsProvider(id)", description = "gets all the products from a provider based on its own ID")
    @ApiResponses(value={
            @ApiResponse(responseCode="200",description="Returned successfully"),
            @ApiResponse(responseCode = "4xx",description = "Database not found."),
            @ApiResponse(responseCode = "500",description = "ID not found")
    })
public ResponseEntity<String> getProductsProvider(@PathVariable int id) {
        return ResponseEntity.ok().body(service.getProductsFromProvider(id).toString());
    }
    
}
