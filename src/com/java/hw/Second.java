package com.java.hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Second {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int x = 0;
		List<String> list = new ArrayList<String>(num);
		x = num;
		scanner.nextLine();
		while (x > 0) {
			list.add(scanner.nextLine());
			x --;
		}
		int total = 0;
		for (String string : list) {
			total += getMax(string, num);
		}
		System.out.println(total);
	}

	public static int getMax(String s, int n) {
		String[] a = s.split(",");
		int total = 0;
		List<String> al = new ArrayList<String>();
		for (int i = 0; i < a.length; i++) {
			String string = a[i];
			al.add(string);
		}
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = Integer.valueOf(a[i]);
		}
		int iiii = 0;
		// 高位为1， 即可低位为0
		while ("0".equals(al.get(0))) {
			al.remove(0);
			al.add("0");
			iiii ++;
			if(iiii == 5)
				break;
		}
		iiii = 0;
		
		while ("1".equals(al.get(n -1))) {
			al.remove(n - 1);
			al.add(0, "1");
			iiii ++;
			if(iiii == 5)
				break;
		}
		int[] aaa = {16,8,4,2,1};
		int i = 0;
		for(String xxxxString :al) {
			if("1".equals(xxxxString)) {
				total += aaa[i];
			}
			i ++;
		}
			return total;
	}
}
