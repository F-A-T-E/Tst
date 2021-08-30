package com.java.test;

public class Tst6 {
	
	abstract class Person{
		
	}
	public class Student extends Person{
		
	}
	
	public class Teacher extends Person{
		
	}
	
	public static void main(String[] args) {
		/*
		 * Student s; Teacher t; if(t instanceof Person) { s=(Student)t; }
		 */
		
		System.out.println("--------------");
		
		String s = new String("hello");
		String t = new String("hello");
		char c [] = {'h','e','l','l','o'};
		
		
		
		
		System.out.println("s.equals(t): " +s.equals(t));
		System.out.println("t.equals(c): " +t.equals(c));
		System.out.println("s==t: " +(s==t));
		System.out.println("t.equals(new String(hello)): " +t.equals(new String("hello")));
		//System.out.println(t==c);
		
		
		
	}
	
	
	

}
