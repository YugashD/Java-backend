package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendController {

    @GetMapping("/employees")
    public String employees() {
        return "employees";
    }

    @GetMapping("/employee/add")
    public String add() {
        return "add";
    }

    @GetMapping("/employee/raise")
    public String raise() {
        return "raise";
    }
}

