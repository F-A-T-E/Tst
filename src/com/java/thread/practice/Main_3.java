package com.java.thread.practice;

public class Main_3 {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("main start....");

		Thread thread = new Thread() {
			public void run() {
				System.out.println("thread start...");

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}

				System.out.println("thread end...");
			}
		};

		thread.start();
		thread.join();

		System.out.println("main end.....");

	}
}
