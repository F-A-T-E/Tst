package com.java.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.sun.javafx.css.CalculatedValue;
import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;




public class Solution {
	
	public static void main(String[] args) {
	       System.out.print(method(0));
	   }
	   private static Integer method(Integer i){
	       try{
	           if(i++ > 0)
	               throw new IOException();
	           return i++;
	       }catch (IOException e){
	           i++;
	           return i++;
	       }catch (Exception e){
	           i++;
	           return i++;
	       }finally {
	           return i++;
	       }
	   }
	 
}
