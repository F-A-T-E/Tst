package com.java.demo;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.LinkedList;
import java.util.Queue;

public class checkSum {
	
	/*
	 * 给定一个整数数组 nums 和一个目标值 k，请实现一个方法判断 nums 中是否存在某个片段（即若干个相连元素）之和等于 k。 
	 * 要求时间复杂度为 O(n)。
	 */
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		System.out.println(checkSum(a,11));
	}
	
	public static boolean checkSum(int[] nums, int k) {
	    // Write your code here.
		int length = nums.length;
		int i = 0;
		int j = 0;
		int sum = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		
		
		for(;i < length; i ++) {
			queue.add(nums[i]);
			sum += nums[i];
			while(sum > k) {
				sum -= queue.peek();
				queue.poll();
				k ++;
			}
			if(sum == k)
				return true;
		}		
		return false;
	}

}
