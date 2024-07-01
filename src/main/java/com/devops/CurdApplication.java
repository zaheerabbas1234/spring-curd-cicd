package com.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CurdApplication {
	
	@GetMapping("/") 
	public String test() {
		return "welcome to first cicd pipeline program";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(CurdApplication.class, args);
	}

}
