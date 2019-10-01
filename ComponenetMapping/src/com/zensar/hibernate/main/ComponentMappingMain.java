package com.zensar.hibernate.main;


import java.io.*;
import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.BlobProxy;
import org.hibernate.engine.jdbc.ClobProxy;
import org.hibernate.Transaction;

import com.zensar.entities.Customer;
import com.zensar.entities.Name;

public class ComponentMappingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Name name = new Name();
		name.setFirstName("Arib");
		name.setMiddleName("");
		name.setLastName("Anwar");
		
		
		Customer cu = new Customer();
		cu.setCustomerName(name);
		cu.setAge(20);
		cu.setcId(120);
		cu.setGender("Male");
		cu.setAddress("Ranchi");
		cu.setBirthDate(LocalDate.of(1997, 03, 22));
		
		try {
			File photo = new File("./resources/Customer.jpg");
			FileInputStream fil = new FileInputStream(photo);
			
			Blob customerPhoto= BlobProxy.generateProxy(fil, photo.length());
				cu.setProfilePic(customerPhoto);
				
				File text2 = new File("./resources/CustomerImport.txt"); 
				FileReader fr = new FileReader(text2);
				Clob desc = ClobProxy.generateProxy(fr,text2.length());
				cu.setDesc(desc);
			session.save(cu);
			
			transaction.commit();
			session.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
