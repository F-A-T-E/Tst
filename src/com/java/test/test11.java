package com.java.test;		
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
		
public class test11 {
	
	private void mian() {
		// TODO Auto-generated method stub
		
		
	}
	
	
	public int[] calculateStatistics (int[] dataArr) {
		 // write code here
		int a[] = new int[3];
		// min max tp90
		Arrays.sort(dataArr);
		int i = dataArr.length;
		int mid;
		int midValue;
		int minValue;
		int maxValue;
		int TP90;
		if(i%2 == 1) {
			mid = i/2 +1;
			midValue = dataArr[mid];
		}else {
			midValue = (dataArr[i/2] + dataArr[i/2+1])/2;
		}
		minValue = dataArr[0];
		maxValue = dataArr[dataArr.length-1];
		int mmmmmm = dataArr.length/10*9;
		TP90 = dataArr[mmmmmm-1];
		a[0] = midValue;
		a[1] = minValue;
		a[2] = maxValue;
		a[3] = TP90;		
		return a;
    }

}
