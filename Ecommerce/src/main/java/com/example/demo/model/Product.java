package com.example.demo.model;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="product_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private int id;
	@Column(name="product_name")
	@NonNull
	private String name;
	@Column(name="product_manufacturer")
	private String manufacturer;
	@Column(name="product_description")
	private String description;	
	public Product(String name, String manufacturer, String description) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.description = description;
	}
	
}
