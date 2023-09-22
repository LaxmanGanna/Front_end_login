package com.ciq.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	
	private long id;
	private String firstName;
	private String lastname;
	private double fee;
//	public Student() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Student(long id, String firstName, String lastname, double fee) {
//		super();
//		this.id = id;
//		this.firstName = firstName;
//		this.lastname = lastname;
//		this.fee = fee;
//	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
}
