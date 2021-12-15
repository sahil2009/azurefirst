package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstApplication {

	@GetMapping(value ="/message")
	public String getStarupMessage() {
		return "App deployed Successfully";
	}
	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

}
