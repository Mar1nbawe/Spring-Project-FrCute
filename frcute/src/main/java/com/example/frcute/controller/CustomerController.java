package com.example.frcute.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.frcute.entities.Customers;
import com.example.frcute.services.CustomersService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import org.springframework.validation.annotation.Validated;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


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

    @PostMapping("/customers/add")
    @Operation(summary = "addProducts(name, price, categoryID)", description = "(POST) Creates a product using the provided parameters")
    @ApiResponses(value={
            @ApiResponse(responseCode="200",description="Created successfully"),
            @ApiResponse(responseCode = "4xx",description = "Table/Database not found"),
            @ApiResponse(responseCode = "500",description = "One of the specified UUIDs was not found")
    })
    public ResponseEntity<Customers> AddCustomer(
     @RequestParam(value = "firstname") String firstname, 
         @RequestParam(value = "lastname") String lastname, 
         @RequestParam(value = "mail") String mail
        ) {
        return ResponseEntity.ok().body(service.addCustomer(firstname, lastname, mail));
    }
    
}
