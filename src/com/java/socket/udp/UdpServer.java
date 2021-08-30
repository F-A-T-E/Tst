package com.java.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 
 * @author lpf18
 *{udp服务端}
 */

public class UdpServer {

	public static void main(String[] args) throws IOException {
		
		System.out.println("UDP服务器启动了。。。。");
		DatagramSocket dS  =  new DatagramSocket(8080);
		
		
		byte[] buf = new byte[1024];
		
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		
		dS.receive(dp);
		
		String add = dp.getAddress().toString();
		
		
		String data =  new String(dp.getData(),0,dp.getLength());
		
		
		System.out.println("服务器接收从ip："+ add +"传输数据：" + data);
		
		
	}
}
