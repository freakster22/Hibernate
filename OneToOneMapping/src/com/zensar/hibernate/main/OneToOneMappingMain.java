package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Country;
import com.zensar.entities.Flag;

public class OneToOneMappingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Country country = new Country();
		Flag flag = new Flag();
		
		country.setName("FreakLand");
		country.setLanguage("Insanity");
		country.setPopulation(6969L);
		
		
		flag.setFlagName("Crazzy");
		flag.setDesc("Black");
		
		
		country.setFlag(flag);
		flag.setCountry(country);
		
		session.save(flag);
		session.save(country);
		transaction.commit();
		session.close();
		System.exit(0);
	}

}
