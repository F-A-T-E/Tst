package com.java.hw;

import java.util.ArrayList;
import java.util.List;

public class Tst {
	public static void main(String[] args) {

		List<String> aList = new ArrayList<String>();
		aList.add("1");
		aList.add("0");
		aList.add("0");
		aList.add(0, "1");
		
		System.out.println(aList);
}
}