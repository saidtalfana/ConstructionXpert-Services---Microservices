package com.service.ressource_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class RessourceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RessourceServiceApplication.class, args);
	}

}
