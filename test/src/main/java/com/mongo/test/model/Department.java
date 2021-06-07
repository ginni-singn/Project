package com.mongo.test.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Department {
	private String id;
	private String dName;
	private String dDescription;
	private Date joiningDate;
	public Department() {
		super();
	}
	public Department(String id, String dName, String dDescription, Date joiningDate) {
		super();
		this.id = id;
		this.dName = dName;
		this.dDescription = dDescription;
		this.joiningDate = joiningDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdDescription() {
		return dDescription;
	}
	public void setdDescription(String dDescription) {
		this.dDescription = dDescription;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	

}
