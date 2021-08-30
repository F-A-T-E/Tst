package com.java.reflect;

import java.lang.reflect.Field;
public class Tst1 {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Demo demo = new Demo("first","second");		
		Class<?> clazz = demo.getClass();		
		Field[] fields = clazz.getDeclaredFields();
		Demo2 demo2 = new Demo2("idString","nameString");
		Class<?> clazzClass = demo2.getClass();
		Field[] fields2 = clazzClass.getDeclaredFields();
		for(int i = 0; i < fields.length; i++)
		{
			for(int j = 0; j < fields2.length; j ++) {
				if(fields[i].getName().equals(fields2[j].getName()) && !fields[i].get(demo).equals(fields2[j].get(demo2))) {
					System.out.println(fields[i].get(demo) +"   "+ fields2[j].get(demo2));
				}
			}
		}
	}
}

