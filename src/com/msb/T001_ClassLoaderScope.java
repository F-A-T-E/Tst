package com.msb;

public class T001_ClassLoaderScope {
	
	
	public static void main(String[] args) {
		String pathBoot = System.getProperty("sun.boot.class.path");
		System.out.println(pathBoot.replaceAll(";", System.lineSeparator()));
		
		
		
	}

}
