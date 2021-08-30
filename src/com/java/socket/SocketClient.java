package com.java.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketClient {
  public static void main(String args[]) throws Exception {
    // Ҫ���ӵķ����IP��ַ�Ͷ˿�
    String host = "127.0.0.1";
    int port = 55533;
    // �����˽�������
    Socket socket = new Socket(host, port);
    // �������Ӻ��������
    OutputStream outputStream = socket.getOutputStream();
    String message = "���  yiwangzhibujian";
    socket.getOutputStream().write(message.getBytes("UTF-8"));
    //ͨ��shutdownOutput���ٷ������Ѿ����������ݣ�����ֻ�ܽ�������
    socket.shutdownOutput();
    
    InputStream inputStream = socket.getInputStream();
    byte[] bytes = new byte[1024];
    int len;
    StringBuilder sb = new StringBuilder();
    while ((len = inputStream.read(bytes)) != -1) {
      //ע��ָ�������ʽ�����ͷ��ͽ��շ�һ��Ҫͳһ������ʹ��UTF-8
      sb.append(new String(bytes, 0, len,"UTF-8"));
    }
    System.out.println("get message from server: " + sb);
    
    inputStream.close();
    outputStream.close();
    socket.close();
  }
}
