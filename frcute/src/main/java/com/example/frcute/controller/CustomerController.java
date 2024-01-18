package com.example.frcute.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.example.frcute.services.CustomersService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import org.springframework.validation.annotation.Validated;

import lombok.RequiredArgsConstructor;

@RestController
@Validated
@RequiredArgsConstructor
public class CustomerController {
    private final CustomersService service;
 
    @GetMapping("/customers/{id}")
    @Operation(summary = "getCustomer(ID)", description = "gets a customers based on its own ID")
    @ApiResponses(value={
            @ApiResponse(responseCode="200",description="Returned successfully"),
            @ApiResponse(responseCode = "4xx",description = "Database not found."),
            @ApiResponse(responseCode = "500",description = "ID not found")
    })
public ResponseEntity<String> getCustomer(@PathVariable int id) {
return ResponseEntity.ok().body(service.getCustomer(id).getId() + " " + service.getCustomer(id).getFirstName() + " " + service.getCustomer(id).getLastName());
}
}
