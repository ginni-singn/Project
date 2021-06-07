package com.mongo.test.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Domain {
	private String id;
	private String dName;
	private String dDescription;
	private Date joiningDate;
	private String ID;
	private Boolean isAct;
	public Domain() {
		super();
	}
	public Domain(String id, String dName, String dDescription, Date joiningDate, String iD2, Boolean isAct) {
		super();
		this.id = id;
		this.dName = dName;
		this.dDescription = dDescription;
		this.joiningDate = joiningDate;
		ID = iD2;
		this.isAct = isAct;
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
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public Boolean getIsAct() {
		return isAct;
	}
	public void setIsAct(Boolean isAct) {
		this.isAct = isAct;
	}
	

}
