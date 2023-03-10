package com.example.J2SE.jdbc.hibernate.manyToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
		
	public static void main(String[] args) {
		Configuration con = new Configuration()
							.configure("hbm.cfg.xml")
							.addAnnotatedClass(Product.class)
							.addAnnotatedClass(Category.class);
		Session session = con.buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Category cat1 = new Category("Mens Fashion");
		Category cat2 = new Category("Fashion");
		Category cat3 = new Category("Clothing");
		Product pd1 = new Product("Hoodie", "Gucci Print Hoodie", 3456.45f);
		Product pd2 = new Product("Jeans", "Levis Jeans", 5456.45f);
		Product pd3 = new Product("Shoes", "Leather Boot", 13456.45f);
		ArrayList<Category> categories = new ArrayList<>();
		categories.add(cat1);
		categories.add(cat2);
		categories.add(cat3);
		pd1.setCategories(categories);
		pd2.setCategories(categories);
		pd3.setCategories(categories);
		ArrayList<Product> products = new ArrayList<>();
		products.add(pd1);
		products.add(pd2);
		products.add(pd3);
		cat1.setProducts(products);
		cat2.setProducts(products);
		cat3.setProducts(products);
		
		
		session.save(cat1);
		session.save(cat2);
		session.save(cat3);
		session.save(pd1);
		session.save(pd2);
		session.save(pd3);
		tx.commit();
		session.close();
		
	}

}
