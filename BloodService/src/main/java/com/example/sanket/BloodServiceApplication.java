package com.example.sanket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.sanket.Feign")
public class BloodServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BloodServiceApplication.class, args);
    }
}
