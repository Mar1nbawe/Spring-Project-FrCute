package com.example.frcute.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.example.frcute.services.CustomersService;

import org.springframework.validation.annotation.Validated;

import lombok.RequiredArgsConstructor;

@RestController
@Validated
@RequiredArgsConstructor
public class CustomerController {
    private final CustomersService service;
 
    @GetMapping("/customers/{id}")
public ResponseEntity<String> getCustomer(@PathVariable int id) {
return ResponseEntity.ok().body(service.getCustomer(id).getId() + " " + service.getCustomer(id).getFirstName() + " " + service.getCustomer(id).getLastName());
}
}
