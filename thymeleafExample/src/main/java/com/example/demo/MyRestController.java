package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	@GetMapping("/api/person")
	public Person getPerson() {
		return new Person(1, "Ramesh", "ramesh@gmail.com");
	}
}
