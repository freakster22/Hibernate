package com.zensar.entities;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Arib
 * @version 3.0
 * @creation_Date 27-09-2019 14:40:00
 * 
 *
 */
@Entity
@DiscriminatorValue("VegRoach1")
public class WageEmp extends Employee {
	private int hours;
	private float rate;
	
	 public WageEmp() {
		// TODO Auto-generated constructor stub
	}

	public WageEmp(int empId, String name, LocalDate joinDate, double salary, int hours, float rate) {
		super(empId, name, joinDate, salary);
		this.hours = hours;
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "WageEmp [hours=" + hours + ", rate=" + rate + "]";
	}
	 
}
