package com.example.healthcheckdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
	
	@GetMapping("/")
	public String home() {
		return "<h1>Welcome to Health Check Demo, proceed to /health</h1>";
	}

	@GetMapping("health")
	public String health_status() {
		return "<h1>status is ok</h1>";
	}

}
