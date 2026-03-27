package com.example.itdept.controller;

import com.example.itdept.consumer.HrConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItDeptController {
    @Autowired
    private HrConsumer consumer;
    @GetMapping("/hi")
    public String hi() {
        return "Hi there!";
    }

    @GetMapping("/it/hr")
    public String hr() {
        return "FROM HR-DEPT " + consumer.getLeave();
    }
}
