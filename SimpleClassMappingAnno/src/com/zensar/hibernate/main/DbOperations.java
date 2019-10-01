package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

public class DbOperations {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure();
		// Single-Ton and heavy weight Session Factory!!!
		SessionFactory factory = configuration.buildSessionFactory();
		// Session is a light weight
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
// Insert a new Record

		
		/*
		 * Product Product = new Product(1011,"Camera","Nikon",24000.00f);
		 * session.save(Product);
		 */

// Getting record as per Primary Key
		/*
		 * Product product1 = session.get(Product.class, 1001); if
		 * (product1.equals(null)) System.out.println("Record not Found!");
		 * 
		 * else System.out.println("FOUND!");
		 */
//Update a RECORD
		/*
		 * Product product1 = session.get(Product.class, 1001); if
		 * (product1.equals(null)) System.out.println("NO PRODUCT EXIST!");
		 * 
		 * else { float p=product1.getPrice(); product1.setPrice(p+222.00f);}
		 */
//Delete a RECORD
		Product product = session.get(Product.class, 1001);
		if(product.equals(null)) System.out.println("Not Exist!");
		else session.delete(product);
	
		transaction.commit();
		session.close();

	}

}
