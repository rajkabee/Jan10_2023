package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Product;
import com.example.demo.model.ProductRepository;

@Controller
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/")
	public String products(Model model) {
		List<Product> products = productRepository.findAll();
		model.addAttribute("products",products);
		return "products";
	}
	
	@GetMapping("/addProduct")
	public String addProductForm() {
		return "ProductForm";
	}
	@PostMapping("/addProduct")
	public String saveProduct(@ModelAttribute Product product) {
		productRepository.save(product);
		return "ProductForm";
	}
}
