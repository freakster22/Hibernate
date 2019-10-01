package com.zensar.hibernate.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

//HIBERNATE QUERY LANGUAGE(Object Oriented Query Language)
public class HqlMain {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		// Single-Ton and heavy weight Session Factory!!!
		SessionFactory factory = configuration.buildSessionFactory();
		// Session is a light weight
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//JPA Query
		/*
		  Query query = session.createQuery("From Product");
		  List<Product> products = query.getResultList();
		  
		  for(Product plist:)
		 */
		//javax.persistence.Query query = session.createQuery("FROM Product p WHERE p.price between 10000 and 20000");
		//System.out.println(query.getResultList());
		
	/*javax.persistence.Query query1 = session.createQuery("FROM Product p WHERE p.brand like '%p%'");
	System.out.println(query1.getResultList());
	
	javax.persistence.Query query2 = session.createQuery("FROM Product p WHERE p.name='Nikon'");
	System.out.println(query2.getResultList());*/
	
	
		/*
		 * Query q = session.createQuery("Select p.name,p.price from Product as p");
		 * 
		 * List<Object[]> objects = q.getResultList(); for( Object[] obj: objects) {
		 * for(Object obj2:obj) { System.out.println(obj2+" "); }
		 * System.out.println(""); }
		 */

		Query query = session.createQuery("Select max(p.price) from Product p");
		Float maxPrice =(Float) query.getSingleResult();
		System.out.println(maxPrice);
		
		Query query2 = session.createQuery("Select min(p.price) from Product p");
		Float minPrice = (Float) query2.getSingleResult();
		System.out.println(minPrice);
		
		Query query3 = session.createQuery("Select sum(p.price) from Product p");
		Double sumPrice = (Double) query3.getSingleResult();
		System.out.println(sumPrice);
		
		//This is Depricated Method; Just for knowledge.
		/*
		 * Criteria criteria = session.createCriteria(Product.class); List<Product>
		 * products = criteria.list(); for(Product p:products) { System.out.println(p);
		 * }
		 */
	}
}
