package com.example.frcute.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.frcute.entities.Products;
import com.example.frcute.services.ProductsService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import org.springframework.validation.annotation.Validated;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;






@RestController
@Validated
@RequiredArgsConstructor
public class ProductsController {
    
    
    private final ProductsService service;
    @GetMapping("/products/show/{id}")
    @Operation(summary = "getProducts(ID)", description = "gets a product based on its own ID")
    @ApiResponses(value={
            @ApiResponse(responseCode="200",description="Returned successfully"),
            @ApiResponse(responseCode = "4xx",description = "Database not found."),
            @ApiResponse(responseCode = "500",description = "ID not found")
    })
public ResponseEntity<String> getProducts(@PathVariable int id) {
return ResponseEntity.ok().body(service.getProductID(id).getProductID() + " " + service.getProductID(id).getName() + " | " + service.getProductID(id).getPrice() + " | " + service.getCategoryName(id));

}

    @PostMapping("/products/create")
    @Operation(summary = "addProducts(name, price, categoryID)", description = "(POST) Creates a product using the provided parameters")
    @ApiResponses(value={
            @ApiResponse(responseCode="200",description="Created successfully"),
            @ApiResponse(responseCode = "4xx",description = "Table/Database not found"),
            @ApiResponse(responseCode = "500",description = "One of the specified UUIDs was not found")
    })
    public ResponseEntity<Products> addProducts(
         @RequestParam(value = "name") String name, 
         @RequestParam(value = "price") int price, 
         @RequestParam(value = "category") long categoryID,
         @RequestParam(value = "description", required = false) String description
         )    
    {

        return ResponseEntity.ok().body(service.addProducts(name, price, categoryID, description));
    }

    @PostMapping("/products/delete")
    @Operation(summary = "deleteProducts(id)", description = "(POST) Deletes a product using the provided parameters")
    @ApiResponses(value={
            @ApiResponse(responseCode="200",description="Created successfully"),
            @ApiResponse(responseCode = "4xx",description = "Table/Database not found"),
            @ApiResponse(responseCode = "500",description = "One of the specified UUIDs was not found")
    })
    public ResponseEntity<String> deleteProducts(
         @RequestParam(value = "id") int id
         )    
    {

        return ResponseEntity.ok().body(service.deleteProducts(id));
    }
}
