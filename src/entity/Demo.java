package entity;

import lombok.Data;

@Data
public class Demo {
	
	public String aString;
	
	public String bString;
	
	public String getaString() {
		return aString;
	}

	public void setaString(String aString) {
		this.aString = aString;
	}

	public String getbString() {
		return bString;
	}

	public void setbString(String bString) {
		this.bString = bString;
	}

	public String getcString() {
		return cString;
	}

	public void setcString(String cString) {
		this.cString = cString;
	}

	public String cString;



}
