package com.java.thread.practice;

public class HelloThread extends Thread{
public void run() {
		
		int n =0;
		while(! isInterrupted()) {
			n ++;
			System.out.println(n +"helloThread!");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				break;
			}
		}
	}

}
