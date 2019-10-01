package com.zensar.hibernate.main;

import java.sql.Connection;
import java.time.LocalDate;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.zensar.entities.Employee;
import com.zensar.entities.WageEmp;

public class InheritenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		
		Employee e = new Employee();
		e.setName("FreakSter");
		e.setJoinDate(LocalDate.of(2019, 8, 26));
		e.setSalary(30000.00);
		
		session.save(e);
		
		WageEmp emp= new WageEmp();
		emp.setName("Roach");
		emp.setJoinDate(LocalDate.of(2016, 2, 10));
		emp.setSalary(25000.00);
		emp.setHours(45);
		emp.setRate(2.5f);
		session.save(emp);
		transaction.commit();
		session.close();
		
	}

}
