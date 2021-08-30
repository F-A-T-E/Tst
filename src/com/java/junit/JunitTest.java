package com.java.junit;

import javax.annotation.PostConstruct;

import org.junit.Before;
import org.junit.Test;


public class JunitTest {
	
	@Before
	public void init() {
		System.out.println("PostConstruct 执行中.....");
	}
	
	
	@Test
	public void junitTest() {
		
		System.out.println("Test进行中....");
		
	}
}
