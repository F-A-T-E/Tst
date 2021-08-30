package com.java.socket.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 
 * @author lpf18
 *		(TCP)客户端
 */

public class TcpClient {

	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("127.0.0.1",8080);			
		try {
			OutputStream OutputStream = socket.getOutputStream();
			
			String msg = "码家学院欢迎大家前来学习";
			
			OutputStream.write(msg.getBytes());
			
			System.out.println("客户端发送消息完毕");
			
			InputStream inputStream = socket.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));			
			String result = br.readLine();
			
			System.out.println("客户端===》服务器返回的结果是:" +result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			socket.close();
		}
		
		
	}
}
