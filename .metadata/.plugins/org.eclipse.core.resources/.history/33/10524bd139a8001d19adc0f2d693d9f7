package com.example.J2SE.jdbc.hibernate.oneToMany;

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
		Category cat = new Category("Mens Fashion");
		Product pd1 = new Product("Hoodie", "Gucci Print Hoodie", 3456.45f);
		Product pd2 = new Product("Jeans", "Levis Jeans", 5456.45f);
		Product pd3 = new Product("Shoes", "Leather Boot", 13456.45f);
		pd1.setCategory(cat);
		pd2.setCategory(cat);
		pd3.setCategory(cat);
		ArrayList<Product> products = new ArrayList<>();
		products.add(pd1);
		products.add(pd2);
		products.add(pd3);
		cat.setProducts(products);
		
		
		session.save(cat);
		session.save(pd1);
		session.save(pd2);
		session.save(pd3);
		tx.commit();
		session.close();
		
	}

}
