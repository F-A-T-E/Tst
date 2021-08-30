package com.java.thread.practice;

public class Main_1 {
	
	public static void main(String[] args) {
		System.out.println("Main Start....");
		Thread T = new Thread() {
			public void run() {
				System.out.println("Thread 内重写run函数  start run....");
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {}
					System.out.println("Thread内重写的润函数 end....");			
			}
		};
		T.start();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		System.out.println("main end!");
	}

}
