package com.java.demo;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		System.out.println(queue.peek());
		
		System.out.println(queue.toString());
		
	}
}
