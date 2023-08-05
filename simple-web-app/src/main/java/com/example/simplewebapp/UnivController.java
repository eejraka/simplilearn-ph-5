package com.example.simplewebapp;

import java.time.LocalDateTime;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8081/
@Slf4j
@RestController
public class UnivController {
	
	Logger log=LoggerFactory.getLogger(UnivController.class);

	@GetMapping("/")
	public String homePage() {
		LocalDateTime localDateTime = LocalDateTime.now();
		log.info("Home Page at time: " + localDateTime);
		return "This is a Simple Web Application developed by Aayush Karjee.";
	}
	
	@GetMapping("/techstack")
	public String techStack() {
		LocalDateTime localDateTime = LocalDateTime.now();
		log.info("Tech Stack Page at time: " + localDateTime);
		return "Spring Boot, Docker and ELK Stack were used to develop this app!";
	}
	
	@GetMapping("/err")
	public String errorPage() {
		LocalDateTime localDateTime = LocalDateTime.now();
		log.error("Error Page at time: " + localDateTime);
		return "ERROR!";
	}
}
