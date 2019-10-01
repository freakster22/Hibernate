package com.zensar.hibernate.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Movie;
import com.zensar.entities.Song;

public class OneToManyHibernateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Movie movie = new Movie();
		movie.setTitle("SpiderMan");
		movie.setReleaseDate(LocalDate.now());
		
		Song song1 = new Song("What's Up Danger");
		Song song2 = new Song("Sunflower");
		Song song3 = new Song("Memories");
		
		song1.setMovie(movie);
		song2.setMovie(movie);
		song3.setMovie(movie);
		
		List<Song> songs = new ArrayList<Song>();
		songs.add(song1);
		songs.add(song2);
		songs.add(song3);
		
		session.save(songs);
		transaction.commit();
		session.close();
		
		
	}

}
