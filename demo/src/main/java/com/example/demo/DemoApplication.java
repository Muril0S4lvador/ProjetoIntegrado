package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	// @GetMapping("/hello")
	// public Greeting hello(@RequestParam(value = "name", defaultValue = "World") String name){
	// 	// return String.format("Hello %s!", name);
	// 	return new Greeting(name, LocalDateTime.now());
	// }

	@GetMapping("/hello")
	public Greeting hello(@RequestBody Settings settings){
		// return String.format("Hello %s!", name);
		return new Greeting(settings, LocalDateTime.now());
	}

	public record Settings(String name, boolean ptBR){}


}
