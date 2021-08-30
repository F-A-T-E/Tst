package com.java.NioBuffer;

import java.nio.ByteBuffer;

/**
 * 
 * @author lpf18
 *{buffer基本方法使用}
 */


public class NIOBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ByteBuffer buf = ByteBuffer.allocate(1024);
		
		
		System.out.println("初始化之后的信息：");
		
		System.out.println("position:" +buf.position());
		System.out.println("limit:" +buf.limit());
		System.out.println("capacity:" +buf.capacity());
		
		System.out.println("------------------------");
		
		/*
		 	放入了5个
		 */
		buf.put("netty".getBytes());
		
		System.out.println("放入值过后：");
		
		System.out.println("position:" +buf.position());
		System.out.println("limit:" +buf.limit());
		System.out.println("capacity:" +buf.capacity());
		
		System.out.println("---------------------------");
		
		System.out.println("开始读过后的效果：");
		buf.flip();
		System.out.println("position:" +buf.position());
		System.out.println("limit:" +buf.limit());
		System.out.println("capacity:" +buf.capacity());
		
		byte[] bytes = new byte[buf.limit()];
		buf.get(bytes);
		
		System.out.println("获取到的值：" + new String(bytes,0,bytes.length));		
		
		System.out.println("-------------------------------");
		System.out.println("获取到值之后：");
		System.out.println("position:" +buf.position());
		System.out.println("limit:" +buf.limit());
		System.out.println("capacity:" +buf.capacity());
		
		
		
	}
}
