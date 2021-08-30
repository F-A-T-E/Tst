package com.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class test10 {
	
	
	public static boolean[] isBlackIp (String[] ipArr, String[] blackIpArr) {
		// write code here
				ArrayList<String> ipList = new ArrayList<String>(Arrays.asList(ipArr));
				ArrayList<String> blackIpList = new ArrayList<String>(Arrays.asList(blackIpArr));
		        List<Boolean> isList = new ArrayList<Boolean>();	        
		        String xString= null;
		        for(int i =0; i < ipList.size();i ++)
		        {
		        	xString = ipList.get(i);
		        	isList.add(blackIpList.contains(xString));
		        	
		        }
		        boolean[] c = new boolean[isList.size()];
		        int i = 0;
		        Boolean[] a = isList.toArray(new Boolean[isList.size()]);
		        for(Boolean x:a)
		        	c[i ++] = x.booleanValue();
		        
		        return c;
    }
	
	
	
	public static void main(String[] args) {
		List aList = new ArrayList<String>();
		
		aList.add("aa");
		aList.add("bb");
		
		
		String[] ipArr = {"192.168.1.1", "192.168.1.2", "192.168.1.3"};
		String[] blackIpArr ={"192.168.1.3", "192.168.1.4"};
		boolean mmm[] = isBlackIp(ipArr,blackIpArr);
		for (boolean b : mmm) {
			System.out.println(b);
		}
	}
	

	

}
