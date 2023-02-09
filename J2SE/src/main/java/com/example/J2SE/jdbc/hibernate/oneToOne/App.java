package com.example.J2SE.jdbc.hibernate.oneToOne;

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
		Product pd = new Product("Hoodie", "Gucci Print Hoodie", 3456.45f);
		pd.setCategory(cat);
		cat.setProduct(pd);
		session.save(cat);
		session.save(pd);
		tx.commit();
		session.close();
		
	}

}
