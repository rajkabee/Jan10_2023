package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Product;
import com.example.demo.model.ProductRepository;

@Controller
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("")
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
	
	@GetMapping("/updateProduct/{id}")
	public String updateProductForm(@PathVariable("id") int id, Model model) {
		Product p = productRepository.findById(id).get();
		model.addAttribute("product",p);
		return "updateProductForm";
	}
	
	@PostMapping("/updateProduct")
	public String updateProduct(@ModelAttribute Product product) {
		productRepository.save(product);
		return "redirect:/products";
	}
	@GetMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
		Product p = new Product();
		p.setId(id);
		productRepository.delete(p);
		return "redirect:/products";
	}
	
}
