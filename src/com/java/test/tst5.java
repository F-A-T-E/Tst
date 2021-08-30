package com.java.test;

public class tst5 {

	public static void main(String[] args) {

		String string1 = new String("ABC");
		
		String string2 = new String("ABC");
		
		System.out.println(string1.equals(string2));
		
		System.out.println(string1 == string2);
	}
}