package com.example.frcute.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import com.example.frcute.entities.Providers;
import com.example.frcute.services.ProvidersService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@Validated
@RequiredArgsConstructor
public class ProvidersController {
    
    private final ProvidersService service;

    @GetMapping("/providers/{id}")
    public ResponseEntity<String> getProviderName(@RequestParam int id) {
        return ResponseEntity.ok().body(service.getProvider(id).getName().toString());
    }
    

}
