package com.java.hw;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inScanner = new Scanner(System.in);
		
		String s = null;
		
		String l = null;
		
		do {
			s = inScanner.nextLine();
		}while(s.length() > 100);
		
		do {
			l = inScanner.nextLine();
		}while(l.length() > 500000);
		int i = 0;
		int j = 0;
		char m;
		char n;
		int flag = 0;
		for(;i < s.length();i++) {
			m = s.charAt(i);
			if(!(m>=97 && m <= 122))
			{
				System.out.println(-1);
				return;
			}
			for(;j < l.length();j++) {
				n = l.charAt(j);
				if(!(n>=97 && n <= 122))
				{
					System.out.println(-1);
					return;
				}
				if(m == n) {
					flag = 1;
					j ++;
					break;
				}
			}
				if(flag == 1)
				{
					flag =0;
					continue;
				}
				if(j >= l.length())
				{
					System.out.println(-1);
					return;
				}
		}
		System.out.println(j-1);	
	}
}
