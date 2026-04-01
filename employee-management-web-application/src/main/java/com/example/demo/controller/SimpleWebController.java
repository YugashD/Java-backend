package com.example.demo.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleWebController {

    @GetMapping({"/", "/login"})
    public String login(@org.springframework.web.bind.annotation.RequestParam(required = false) String error,
                        @org.springframework.web.bind.annotation.RequestParam(required = false) String logout,
                        Model model) {
        if (error != null) model.addAttribute("error", "1");
        if (logout != null) model.addAttribute("logout", "1");
        return "login";
    }

    @GetMapping("/welcome")
    public String welcome(Model model) {
        var auth = SecurityContextHolder.getContext().getAuthentication();
        String username = (auth != null && auth.isAuthenticated()) ? auth.getName() : "anonymous";
        model.addAttribute("username", username);
        return "welcome";
    }
}

