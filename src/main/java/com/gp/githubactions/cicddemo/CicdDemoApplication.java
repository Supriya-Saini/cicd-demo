package com.gp.githubactions.cicddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdDemoApplication.class, args);
	}
	@GetMapping("/welcome")
	public String getMessage() {
		return "Hello Supriya!";
	}

}
