package com.example.healthcheckdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
	
	@GetMapping("/")
	public String home() {
		return "Welcome to Health Check Demo, proceed to /health";
	}

	@GetMapping("health")
	public String health_status() {
		return "status 200: OK";
	}

}
