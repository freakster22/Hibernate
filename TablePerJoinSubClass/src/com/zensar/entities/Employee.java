package com.zensar.entities;

import java.time.LocalDate;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author Arib
 * @version 2.0
 * @creation_Date 27-09-2019 11:30:00
 * @modification_date 27-09-2019 14:15:00
 * @DESCRIPTION it is Persistent
 *
 */


@Entity
@Table(name="Emp_Master_2")
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int EmpId;
	private String name;
	private LocalDate joinDate;
	private double Salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	

	public Employee(int empId, String name, LocalDate joinDate, double salary) {
		super();
		EmpId = empId;
		this.name = name;
		this.joinDate = joinDate;
		Salary = salary;
	}


	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	
	
	
}
