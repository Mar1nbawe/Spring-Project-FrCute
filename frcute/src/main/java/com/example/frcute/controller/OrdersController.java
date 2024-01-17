package com.example.frcute.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import com.example.frcute.services.OrderService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@Validated
@RequiredArgsConstructor
public class OrdersController {
    
    private final OrderService service;

    @GetMapping("/orders/{id}")
    public ResponseEntity<String> GetOrder(@RequestParam int id) {
        return ResponseEntity.ok().body(service.getOrderID(id).toString());
    }
    
    


}
