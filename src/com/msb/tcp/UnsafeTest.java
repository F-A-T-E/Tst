package com.msb.tcp;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class UnsafeTest {
	
	public static void main(String[] args) {
		ByteBuffer buffer = ByteBuffer.allocate(16);
		buffer.put((byte)23);
		buffer.putInt(84514212);
		buffer.flip();
		System.out.println(buffer.get());
		ByteBuffer directBuffer = ByteBuffer.allocateDirect(16);
		directBuffer.put((byte)23);
		directBuffer.get();
	}

}