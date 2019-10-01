package com.zensar.hibernate.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Customer;
import com.zensar.entities.Name;

public class CustomerGetDemo {
	public static void main(String[] args) {
		

	Configuration configuration = new Configuration().configure();
	SessionFactory factory = configuration.buildSessionFactory();
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	Customer customer = session.get(Customer.class, 120);
	System.out.println(customer.getcId());
	System.out.println(customer.getAddress());
	System.out.println(customer.getGender());
	System.out.println(customer.getBirthDate());
	System.out.println(customer.getAge());
	Name customerName= customer.getCustomerName();
	System.out.println();
	
	try {
		
		Blob customerPic= customer.getProfilePic();
		FileOutputStream fOut= new FileOutputStream("./resources/newPhoto.jpg");
		InputStream in = customerPic.getBinaryStream();
		int data =0;
		while((data=in.read())!=-1) {
			fOut.write(data);
		}
		fOut.close();
		Clob desc = customer.getDesc();
		Reader reader = desc.getCharacterStream();
		PrintWriter pw = new PrintWriter("./resources/Song.txt");
		int charData = 0;
		while((charData= reader.read())!=-1) {
			pw.print((char)charData);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	transaction.commit();
	session.close();
	
	}
}
