package com.rhythmnotes.rhythmnotesbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class RhythmNotesBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhythmNotesBackendApplication.class, args);
	}


	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/rhythmnotes/add").allowedOrigins("http://localhost:5173");
				registry.addMapping("/rhythmnotes/all").allowedOrigins("http://localhost:5173");
			}
		};
	}

}
