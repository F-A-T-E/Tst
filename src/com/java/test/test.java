package com.java.test;
		
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Stack;
import java.util.Vector;
		
public class test {
	public static void main(String[] args) {		
		/*
		 * Integer aInteger = new Integer("6"); Integer xInteger = new Integer("666");
		 * System.out.println(xInteger);
		 */
		/*
		 * StringBuilder stringBuilder = new StringBuilder();
		 * stringBuilder.append("sakjfbjekrbvj");
		 * 
		 * stringBuilder.delete(0, stringBuilder.length()-1);
		 * System.out.println(stringBuilder);
		 */
		Stack stack = new Stack();
		System.out.println(stack);
		System.out.println(stack.isEmpty());
		stack.add('(');
		System.out.println(stack.size());
		System.out.println(stack);
	}
}
