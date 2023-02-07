package com.example.J2SE.oop.encapsulation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private int id;
	private String name;
	private String manufacturer;
	private float price;
	

	
//	public Product() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Product(int id, String name, String manufacturer, float price) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.manufacturer = manufacturer;
//		this.price = price;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getManufacturer() {
//		return manufacturer;
//	}
//	public void setManufacturer(String manufacturer) {
//		this.manufacturer = manufacturer;
//	}
//	public float getPrice() {
//		return price;
//	}
//	public void setPrice(float price) {
//		this.price = price;
//	}
//	@Override
//	public String toString() {
//		return "Product [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + ", price=" + price + "]";
//	}
	
	
	
}
