package com.example.J2SE.jdbc.hibernate.oneToOne;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String manufacturer;
	private float price;
	@OneToOne//(mappedBy = "product")
	private Category category;
	public Product(String name, String manufacturer, float price) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	
}
