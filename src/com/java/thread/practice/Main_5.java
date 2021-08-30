package com.java.thread.practice;

public class Main_5 {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new MyThread_();
		t.start();
		Thread.sleep(1000);
		t.interrupt();
		t.join();
		System.out.println("main end..");
	}
}

/*
	 如果线程处于等待状态，
	 例如，t.join()会让main线程进入等待状态.此时，如果对main线程调用interrupt()，join()方法会立刻抛出InterruptedException.
	 因此，目标线程只要捕获到join()方法抛出的InterruptedException，
	 就说明有其他线程对其调用了interrupt()方法，通常情况下该线程应该立刻结束运行。
 */
class MyThread_ extends Thread{
	public void run() {
		
		Thread hello =  new HelloThread1();
		
		hello.start();		
		try {
			hello.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("MyThread_"+e.getMessage());
			/* System.out.println(e.getMessage()); */
			/* System.out.println("MyThread_5 interrupted!"); */
		}		
		hello.interrupt();		
	}
}


class HelloThread1 extends Thread{
	
	public void run() {
		
		int n =0;
		while(! isInterrupted()) {
			n ++;
			System.out.println(n +" helloThread!");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("HelloThread1 "+e.getMessage());
				/* System.out.println("HelloThread1 interrupted"); */
				break;
			}
		}
	}
}