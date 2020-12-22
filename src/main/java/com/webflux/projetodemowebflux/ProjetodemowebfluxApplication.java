package com.webflux.projetodemowebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class ProjetodemowebfluxApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(ProjetodemowebfluxApplication.class, args);
		System.out.println("Application Online");
	}

}
