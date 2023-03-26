package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController{
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@RequestMapping("/user")
	public String user() {
		return "user";
	}
	@RequestMapping("/manager")
	public String manager() {
		return "manager";
	}
	@RequestMapping("/admin")
	public String admin() {
		return "admin";
	}
//	@RequestMapping("/login")
//	public String login() {
//		return "login";
//	}
//	@RequestMapping("/logout")
//	public String logout() {
//		return "logout";
//	}
}
