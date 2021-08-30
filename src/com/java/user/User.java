package com.java.user;

import lombok.Data;

@Data
public class User {
	
	
	public String nameString;
	
	public String idString;
	
	
	public String aString;


	public String getNameString() {
		return nameString;
	}


	public void setNameString(String nameString) {
		this.nameString = nameString;
	}


	public String getIdString() {
		return idString;
	}


	public void setIdString(String idString) {
		this.idString = idString;
	}


	public String getaString() {
		return aString;
	}


	public void setaString(String aString) {
		this.aString = aString;
	}


	public User(String nameString, String idString, String aString) {
		super();
		this.nameString = nameString;
		this.idString = idString;
		this.aString = aString;
	}
	
	

}
