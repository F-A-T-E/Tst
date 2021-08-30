package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set {
	
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("first");
		hashSet.add("second");
		hashSet.add("third");
		for (String string : hashSet) {
			System.out.printf(string + "----");
		}
		System.out.println("------------");
		System.out.println();
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("first");
		treeSet.add("second");
		treeSet.add("third");
		treeSet.add("123");
		treeSet.add("456");
		treeSet.add("a");
		treeSet.add("b");
		treeSet.add("c");		
		for (String string : treeSet) {
			System.out.printf(string + "----");
		}			
	}
}
