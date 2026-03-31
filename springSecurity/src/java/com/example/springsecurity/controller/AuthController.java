package com.example.springsecurity.controller;

import com.example.springsecurity.JwtUtil.JwtUtil;
import com.example.springsecurity.dto.LoginRequest;
import com.example.springsecurity.dto.LoginResponse;
import com.example.springsecurity.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService authService;
    @Autowired
    private JwtUtil jwtUtil;
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        boolean isValidUser = authService.authenticate(request.getUsername(), request.getPassword());
        if (!isValidUser) {
            return ResponseEntity.status(401).body("Invalid username or password");
        }
        String token = jwtUtil.generateToken(request.getUsername());
        return ResponseEntity.ok(new LoginResponse(token));
    }
}
