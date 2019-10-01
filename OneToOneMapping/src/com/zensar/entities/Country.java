package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author Arib Anwar
 * @version 1.0
 * @creation_Date 27-09-2019 15:00:00
 * @Modification_Date 27-09-2019 15:00:00
 * @description One to One Mapping Implementation Foreign Key and other
 *              attributes
 *
 */
@Entity

public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int countryId;
	private String name;
	private String language;
	private long population;
	@OneToOne(mappedBy = "country")
	//@JoinColumn(name = "flagId")
	private Flag flag;//Has-A Relationship One to One Mapping
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public Flag getFlag() {
		return flag;
	}
	public void setFlag(Flag flag) {
		this.flag = flag;
	}
	
	
	
}
