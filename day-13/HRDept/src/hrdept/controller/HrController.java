package com.example.hrdept.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HrController {
    @GetMapping("/Hr/leave")
    public String leave() {
        return "Leave is approved";
    }
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Hr Department";
    }
}

