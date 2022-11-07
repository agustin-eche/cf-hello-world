package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/")
	public String sendMailApi() {
		return "Welcome to SAP BTP Cloud Foundry nueva prueba...CLI";
	}

}
