package com.java.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Solution1{
	
	    public int[][] kClosest(int[][] points, int K) {
	        Arrays.sort(points, new Comparator<int[]>() {
	            public int compare(int[] point1, int[] point2) {
	                return (point1[0] * point1[0] + point1[1] * point1[1]) - (point2[0] * point2[0] + point2[1] * point2[1]);
	            }
	        });
	        return Arrays.copyOfRange(points, 0, K);
	    }  
	    
	    /*
			public static <T> void sort(T[] a, Comparator<? super T> c) {
			        if (c == null) {
			            sort(a);
			        } else {
			            if (LegacyMergeSort.userRequested)
			                legacyMergeSort(a, c);
			            else
			                TimSort.sort(a, 0, a.length, c, null, 0, 0);
			        }
			    }
	    */
	    Comparator<int[]> aComparator = new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
}
