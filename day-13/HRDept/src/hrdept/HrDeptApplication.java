package com.example.hrdept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HrDeptApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrDeptApplication.class, args);
    }

}
