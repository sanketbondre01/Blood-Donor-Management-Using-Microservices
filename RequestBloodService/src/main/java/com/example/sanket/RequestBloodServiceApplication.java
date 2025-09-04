package com.example.sanket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.sanket.Feign")
public class RequestBloodServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequestBloodServiceApplication.class, args);
	}

}
