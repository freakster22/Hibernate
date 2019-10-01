package com.zensar.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Movie;
import com.zensar.entities.Song;

public class MovieDeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Movie m = session.get(Movie.class, 1);
		System.out.println(m.getTitle());
		System.out.println(m.getReleaseDate());
		//List<Song> songs = m.getSongs();
		
		if(m!=null) {
			session.delete(m);
		}
		else {
			System.out.println("Movie Not found");
		}
		
			
	
		transaction.commit();
		session.close();
		System.exit(0);
	}

}
