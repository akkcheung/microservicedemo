package com.example.microservicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicedemoApplication.class, args);
	}

}
