package com.cfgbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Stock1Main {

	public static void main(String[] args) {
		SpringApplication.run(Stock1Main.class, args);
		System.out.println("Microservice Stock1 Main JPA with Hibernate started");

	}

}
