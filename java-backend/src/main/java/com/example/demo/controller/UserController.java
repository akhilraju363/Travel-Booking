
package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
public class UserController {

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        // In a real application, you would save the user to a database here.
        System.out.println("User registered: " + user.getName());
        return "User registered successfully";
    }
}
