package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringOrmMongoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringOrmMongoApplication.class, args);

		System.out.println("Starting...");
	}

}
