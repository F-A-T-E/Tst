package com.java.thread.practice;

public class Main_0 {

	public static void main(String[] args) {
		TimerThread t = new TimerThread();
		t.setDaemon(true);
		t.start();
	}
}
