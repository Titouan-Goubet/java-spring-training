package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
        .allowedOrigins("http://localhost:5173") // Autorise les requêtes de Vite.js
        .allowedMethods("GET", "POST", "PUT", "DELETE") // Autorise ces méthodes HTTP
        .allowedHeaders("*") // Autorise tous les headers
        .allowCredentials(true); // Autorise l'envoi de cookies
  }
}