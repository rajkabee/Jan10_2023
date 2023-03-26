package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@RequestMapping("/")
	public String home() {
		return "Home Page";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "User Page";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "Admin Page";
	}
	
	@RequestMapping("/newUser")
	public String newUser(@ModelAttribute User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userRepository.save(user);
		return "user saved";
	}
	
}
