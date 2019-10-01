package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class Flag {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flagId;
	private String flagName;
	private String desc;
	@OneToOne
	@JoinColumn(name = "countryId")
	private Country country; //Bi-lateral Association
	public int getFlagId() {
		return flagId;
	}
	public void setFlagId(int flagId) {
		this.flagId = flagId;
	}
	public String getFlagName() {
		return flagName;
	}
	public void setFlagName(String flagName) {
		this.flagName = flagName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
	
}
