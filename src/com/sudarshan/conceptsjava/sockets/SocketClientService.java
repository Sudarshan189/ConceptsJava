package com.sudarshan.conceptsjava.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class SocketClientService {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            SocketAddress socketAddress = new InetSocketAddress("localhost",9000);
            socket.connect(socketAddress);
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String data = null;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
