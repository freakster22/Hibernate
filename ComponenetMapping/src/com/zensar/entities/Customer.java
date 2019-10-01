package com.zensar.entities;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import java.sql.*;

/**
 * @author Arib Anwar
 *@creation_Date 26th September 2019 14:54
 *@version 1.0
 *@
 */
@Entity
@Table(name="customer")
public class Customer {
	@Id
	@Column(name="cId")
	private int cId;
	private Name customerName;//Contained Object type
	private String gender;
	private int age;
	@Column(nullable = false)
	private String address;
	private LocalDate birthDate;
	private Blob profilePic;
	private Clob desc;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Customer(int cId, Name customerName, String gender, int age, String address, LocalDate birthDate,
			Blob profilePic, Clob desc) {
		this.cId = cId;
		this.customerName = customerName;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.birthDate = birthDate;
		this.profilePic = profilePic;
		this.desc = desc;
	}



	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public Name getCustomerName() {
		return customerName;
	}
	public void setCustomerName(Name customerName) {
		this.customerName = customerName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	

	public Blob getProfilePic() {
		return profilePic;
	}
	

	

	public void setProfilePic(Blob profilePic) {
		this.profilePic = profilePic;
	}
	
	public Clob getDesc() {
		return desc;
	}

	public void setDesc(Clob desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", customerName=" + customerName + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}
