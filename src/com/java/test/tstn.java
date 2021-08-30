package com.java.test;

public class tstn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2,s3 = "abc", s4 ="abc" ;
        s1 = new String("abc");
        s2 = new String("abc");
        System.out.println("s1==s2:"+(s1==s2));
        System.out.println("s1==s3:"+(s1==s3));
        System.out.println("s3==s4:"+(s3==s4));
        System.out.println("s1.equals(s2):"+(s1.equals(s2)));
        System.out.println("s1.equals(s3):"+(s1.equals(s3)));
        System.out.println("s3.equals(s4):"+(s3.equals(s4)));

	}

}
