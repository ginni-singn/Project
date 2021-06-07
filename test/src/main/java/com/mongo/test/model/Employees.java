package com.mongo.test.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.core.mapping.Document;

//import com.mongo.demo.model.Address;
@Document
public class Employees {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String designation;
	private Address address;
	private String domain;
	private Date joiningDate;
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employees(String firstName, String lastName, String designation, com.mongo.test.model.Address address,
			String domain, Date joiningDate, boolean isActive) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.address = address;
		this.domain = domain;
		this.joiningDate = joiningDate;
	}
	private boolean isActive;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	

}
