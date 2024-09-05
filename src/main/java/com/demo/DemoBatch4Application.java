package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoBatch4Application {
	@GetMapping("/msg")
	public String getmessage() {
		return "welcome to amdocs";
	}
	@GetMapping("/msg1")
	public String getmessage1() {
		return "This is your 2nd API";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoBatch4Application.class, args);
	}

}
