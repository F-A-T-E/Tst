package com.java.thread.practice;
import com.java.test.test;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread T = new MyThread();
		T.start();	
	
		/*Thread thread = new Thread();
		thread.start();*/
		
		
		//创建thread实例时传入一个runnable实例
		Thread thread = new Thread(new MyRunnable());
		thread.start();
	}
}