package com.msb.tcp;

import java.nio.ByteBuffer;

public class ByteBufferTest {	
	public static void main(String[] args) {
		ByteBuffer buffer = ByteBuffer.allocate(16);
		//ByteBuffer directBuffer=ByteBuffer.allocateDirect(16);
		buffer.put((byte)23);
		buffer.putInt(648454212);
		buffer.flip();
		System.out.println(buffer.get());
		System.out.println(buffer.getInt());		
		ByteBuffer directBuffer = ByteBuffer.allocateDirect(16);
		buffer.put((byte)23);
		
	}

}
