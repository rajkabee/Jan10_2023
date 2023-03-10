package com.example.springFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("product")
public class Product {
	int id;
	String name;
	String manufacturer;
	@Autowired
	@Qualifier(value="date")
	Date mfd;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, String manufacturer) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
	}
	
	
	public Product(int id, String name, String manufacturer, Date mfd) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.mfd = mfd;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public Date getMfd() {
		return mfd;
	}

	public void setMfd(Date mfd) {
		this.mfd = mfd;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + ", mfd=" + mfd + "]";
	}

	
	
}	
