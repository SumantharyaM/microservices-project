package com.example.users.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<String> getUsers() {
        return Arrays.asList("Alice", "Bob", "Charlie");
    }
}
