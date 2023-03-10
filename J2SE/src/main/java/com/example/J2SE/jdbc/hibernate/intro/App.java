package com.example.J2SE.jdbc.hibernate.intro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	public static void main(String[] args) {
		//Product product = 
		//new Product("Ceramic Flower Pot", "China Ceramics", 23421.34f);
		
		Configuration con = new Configuration()
							.configure("hbm.cfg.xml")
							.addAnnotatedClass(Product.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		//session.save(product);
		
		//Product pd = session.find(Product.class, 2);
		//System.out.println(pd);
		
//		Product p = 
//		new Product(2, "Soap Dispendor", "Unilever", 421.34f);
//		session.saveOrUpdate(p);
		
		session.delete(new Product(2, null, null, 0f));
	
		tx.commit();
		session.close();
		
	}
}
