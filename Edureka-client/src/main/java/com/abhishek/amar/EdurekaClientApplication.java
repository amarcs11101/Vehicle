package com.abhishek.amar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EdurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdurekaClientApplication.class, args);
	}

}
