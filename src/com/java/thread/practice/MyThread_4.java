package com.java.thread.practice;

public class MyThread_4 extends Thread{
	
	public void run() {
		int n = 0;
		while(! isInterrupted()) {
			n ++;
			System.out.println( n +"hello!");
		}
	}

}
