package com.java.thread.practice;

public class Main_4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new MyThread_4();
		
		thread.start();
		
		Thread.sleep(1);
		
		thread.interrupt();
		
		thread.join();
		
		System.out.println("main end...");
		
	}

}
