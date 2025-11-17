
package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    // A simple in-memory map to store users for this example
    // In a real application, you would use a database
    private final java.util.Map<String, User> users = new java.util.HashMap<>();

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        if (users.containsKey(user.getEmail())) {
            return "Email already exists";
        }
        users.put(user.getEmail(), user);
        return "User registered successfully";
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody User loginAttempt) {
        User storedUser = users.get(loginAttempt.getEmail());
        if (storedUser == null) {
            return "User not found";
        }
        if (storedUser.getPassword().equals(loginAttempt.getPassword())) {
            return "Login successful";
        }
        return "Invalid credentials";
    }

    // User model
    public static class User {
        private String name;
        private String email;
        private String password;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
