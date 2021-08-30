package com.java.user;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class n {
	
	public static void main(String[] args) {
		List<User> list = new ArrayList<>();
		
		User user = new User("1","1","1");
		
		list.add(new User("1","1","1"));
		list.add(new User("2","2","2"));
		list.add(new User("3","3","3"));
		
		System.out.println(list.stream().anyMatch(element -> element.getNameString().equals("1")));
		
		
		List<String> orders=list.stream().map(User::getNameString).collect(Collectors.toList());
		
		System.out.println(orders.contains("2"));
		
		System.out.println(orders.contains("4"));
		
		System.out.println(orders.size());
		
		
		String a = list.stream().filter(item -> item.getNameString().equals("1")).findFirst().get().getNameString();
		System.out.println(a);

	}

}
