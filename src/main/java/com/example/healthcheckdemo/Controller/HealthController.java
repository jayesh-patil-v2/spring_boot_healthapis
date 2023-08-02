package com.example.healthcheckdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
	
	@GetMapping("health")
	public String health_status() {
		return "status is ok";
	}

}
