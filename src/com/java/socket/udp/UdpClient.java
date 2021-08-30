package com.java.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpClient {

	public static void main(String[] args) throws IOException {
		
		String msg = "socket编程之udp客户端222";
		DatagramSocket ds = new DatagramSocket();
		
		byte[] bytes = msg.getBytes();
		
		DatagramPacket dP = new DatagramPacket(bytes, bytes.length,new InetSocketAddress("127.0.0.1",8080));
		
		ds.send(dP);
		
		ds.close();
		
		
		System.out.println("客户端发送信息完毕。");
		
	}
}
