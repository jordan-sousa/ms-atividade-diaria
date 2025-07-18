package com.jordan.art;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ArtApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtApplication.class, args);
	}

}
