package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Arib Anwar
 * @creation_Date: 27-09-2019 16:42:00
 * @version 1.0
 * @description One Movie many Songs
 * 				One to Many Mapping
 *
 */
@Entity
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int songId;
	private String SongName;
	@ManyToOne
	@JoinColumn(name="movieId")
	private Movie movie;
	
	public Song() {
		// TODO Auto-generated constructor stub
	}

	public Song(String songName) {
		super();
		SongName = songName;
	}

	

	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	public String getSongName() {
		return SongName;
	}

	public void setSongName(String songName) {
		SongName = songName;
	}

	
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Song [songId=" + songId + ", SongName=" + SongName + "]";
	}
	
}
