package com.java.thread.practice;

public class MyThread_5 extends Thread{
	public void run() {
		
		Thread hello =  new HelloThread();
		
		hello.start();		
		try {
			hello.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("MyThread_5 interrupted!");
		}		
		hello.interrupt();		
	}

}
