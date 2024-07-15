package com.srivath.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@Value("${msg}")
	private String welcome;
	
	@GetMapping("/welcome")
	public String welcome() {
		return welcome;
	}
}
