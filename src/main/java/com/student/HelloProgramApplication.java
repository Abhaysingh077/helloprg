package com.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloProgramApplication {
 
	@GetMapping("/m")
	public String m() {
		return "hello welcome in azure";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(HelloProgramApplication.class, args);
	}

}