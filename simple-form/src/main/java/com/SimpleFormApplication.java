package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {
		"com.controller", // Scanne les contrôleurs
		"com.service", // Scanne les services
		"com.repository", // Scanne les repositories
		"com.model" // Scanne les entités ou d'autres composants
})
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.repository")

public class SimpleFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleFormApplication.class, args);
	}

}
