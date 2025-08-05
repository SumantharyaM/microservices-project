package com.example.products.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<String> getProducts() {
        return Arrays.asList("Laptop", "Phone", "Tablet");
    }
}
