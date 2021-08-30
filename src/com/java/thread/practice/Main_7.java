package com.java.thread.practice;

public class Main_7 {

	public static void main(String[] args) throws InterruptedException {
		Thread add = new AddThread();
		Thread dec = new DecThread();
		add.start();
		dec.start();
		
		add.join();
		dec.join();
		
		System.out.println(counter.count);
	}
}

class counter {
	public static int count = 0;
}

class AddThread extends Thread{
	public void run() {
		for(int i = 0;i < 10000; i ++)
			counter.count += 1;
	}
}

class DecThread extends Thread{
	public void run() {
		for(int i =0;i < 10000;i ++)
			counter.count -= 1;
	}
}