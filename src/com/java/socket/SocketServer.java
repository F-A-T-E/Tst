package com.java.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
  public static void main(String args[]) throws IOException {
    // ����ָ���Ķ˿�
    int port = 55533;
    ServerSocket server = new ServerSocket(port);
    // server��һֱ�ȴ����ӵĵ���
    System.out.println("server��һֱ�ȴ����ӵĵ���");
    
    while(true){
      Socket socket = server.accept();
      // ���������Ӻ󣬴�socket�л�ȡ�����������������������ж�ȡ
      InputStream inputStream = socket.getInputStream();
      byte[] bytes = new byte[1024];
      int len;
      StringBuilder sb = new StringBuilder();
      while ((len = inputStream.read(bytes)) != -1) {
        // ע��ָ�������ʽ�����ͷ��ͽ��շ�һ��Ҫͳһ������ʹ��UTF-8
        sb.append(new String(bytes, 0, len, "UTF-8"));
      }
      System.out.println("get message from client: " + sb);
      inputStream.close();
      socket.close();
    }
  }
}