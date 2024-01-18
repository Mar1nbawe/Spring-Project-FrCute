package com.example.frcute.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import com.example.frcute.entities.Providers;
import com.example.frcute.services.ProvidersService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@Validated
@RequiredArgsConstructor
public class ProvidersController {
    
    private final ProvidersService service;

    @GetMapping("/providers/{id}")
    @Operation(summary = "getProviderName(id)", description = "gets the name of the provider based on its own ID")
    @ApiResponses(value={
            @ApiResponse(responseCode="200",description="Returned successfully"),
            @ApiResponse(responseCode = "4xx",description = "Database not found."),
            @ApiResponse(responseCode = "500",description = "ID not found")
    })
    public ResponseEntity<String> getProviderName(@RequestParam int id) {
        return ResponseEntity.ok().body(service.getProvider(id).getName().toString());
    }
    

}
