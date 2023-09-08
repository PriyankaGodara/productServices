package com.ecommerce.productservices.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductMappingController {

    @PostMapping
    public String createProductCategory() {
         return "Create a new product with id " + UUID.randomUUID();
    }

    //localhost:8080/api/v1/products/123
    @GetMapping("{id}")
    public String getProductCategoryById(@PathVariable("id") Long id) {
      return "Here is the product category id " + id;
    }
    @GetMapping
    public void getAllProductCategory() {

    }
    @PutMapping("{id}")
    public void updateProductCategoryById() {

    }
    @DeleteMapping("{id}")
    public void deleteProductCategoryById() {

    }
}
