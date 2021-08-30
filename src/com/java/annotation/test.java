package com.java.annotation;

public class test {
	
	public static void main(String[] args) {
		Class<Son> sonClass = Son.class;
		
		MyTestAnnotation annotation = sonClass.getAnnotation(MyTestAnnotation.class);
	}

}
