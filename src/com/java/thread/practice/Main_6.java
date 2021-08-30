package com.java.thread.practice;

public class Main_6 {

	public static void main(String[] args) throws InterruptedException {
		HelloThread_2 t = new HelloThread_2();
		t.start();
		
		/* Thread.sleep(1); */
		
		t.running = false;		
	}
}


 class HelloThread_2 extends Thread{
	 
	 public volatile boolean running = true;
	 
	 public void run(){
		 int n = 0;
		 while(running) {
			 n ++;
			 System.out.println(n +"hello");
		 }
		 System.out.println("end...");
	 }	
}