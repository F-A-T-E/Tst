package com.java.collection;

import java.util.ArrayList;



public class FuZhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ArrayList<String> a = new ArrayList<String>(); a.add("a"); a.add("b");
		 * ArrayList<String>b; b = a; b.add("c"); for(String s : a)
		 * System.out.println(s);
		 */
		
		ArrayList<String> arrayList  = new ArrayList<String>();
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		
		/*
		  	方式 1 
		 */
		
		ArrayList<String>  bArrayList = new ArrayList<String>(arrayList);

		for(String x:bArrayList)
			System.out.print(x +" ");
		
		System.out.println();
		/*
		  方式 2
		 */
		
		
		ArrayList<String> cArrayList = (ArrayList<String>) arrayList.clone();
		
		for(String x:cArrayList)
			System.out.print(x +" ");

		System.out.println();
		
		/*
		  方式 3
		 */
		
		ArrayList<String> dArrayList = new ArrayList<String>();
		
		dArrayList.addAll(arrayList);
		
		for(String x:dArrayList)
			System.out.print(x +" ");
		
		System.out.println();
		/*
		 	方式 4
		 */
		
		ArrayList<String> eArrayList = new ArrayList<String>();
		for(String eString:arrayList)
			eArrayList.add(eString);
		for(String x:dArrayList)
			System.out.print(x +" ");
		
		
		
	}

}
