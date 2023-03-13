package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyController {
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("msg", "hello from my first spring boot app!");
		List<String> names = Arrays.asList(new String[] {"Subodh", "Sanjeep", "Sangam"});
		model.addAttribute("names",names);
		return "index";
	}
	
	@ResponseBody
	@RequestMapping("/data")
	public String data(Model model) {
		String msg="hello from my first spring boot app!";
		return msg;
	}
	
}
