package com.example.javafull0503;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpringWorld {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringWorld.class, args);
	}

	@RequestMapping(value = "/")
	String hello() {
		return "Hello, world!";
	}

}
