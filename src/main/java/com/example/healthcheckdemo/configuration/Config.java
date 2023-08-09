package com.example.healthcheckdemo.configuration;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class Config implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedOrigins("http://d1mhiwxsb4ji6x.cloudfront.net")
		.allowedMethods("GET", "POST", "PUT","DELETE");
	}

}
