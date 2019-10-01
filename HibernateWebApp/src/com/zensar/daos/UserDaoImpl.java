package com.zensar.daos;
/**
 * @author Arib Anwar, 2019.
 * @version 2.1
 * @creation_date Sep. 21, 2019 05:37 PM
 * @modification_date Sep. 28, 2019 11:20 AM
 * @copyright Zensar Technologies, India. All rights reserved.
 * @description It is Data Access Object (DAO) interface implementer class.
 * 				It is used in Persistence Layer of Application.
*/

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.User;

public class UserDaoImpl implements UserDao {
	private Session session;
	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		session = factory.openSession();
		
	
	}
	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		session.update(user);
		transaction.commit();
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		session.delete(user);
		transaction.commit();
	}

	@Override
	public User getByUsername(String username) {
		// TODO Auto-generated method stub
		return session.get(User.class,username);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		Query query1 = session.createQuery("From User");
		return query1.getResultList();
	}

	
}
