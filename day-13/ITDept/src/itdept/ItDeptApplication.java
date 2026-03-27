package com.example.itdept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ItDeptApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItDeptApplication.class, args);
    }

}
