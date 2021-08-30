package com.java.collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import com.google.common.collect.Maps;
import jdk.nashorn.internal.runtime.JSONFunctions;
import sun.awt.HKSCS;
import sun.security.provider.Sun;

public class MapTst {
	
	public static void main(String[] args) {	
		System.out.println(String.class.getClassLoader());
		/* System.out.println(sun.awt.HKSCS.class.getClassLoader()); */
		/*
		 * System.out.println(sun.net.spi.nameservice.dns.DNSNameService.class.
		 * getClassLoader());
		 */
		System.out.println(MapTst.class.getClassLoader());
		System.out.println(MapTst.class.getClassLoader().getClass().getClassLoader());
	}
}
