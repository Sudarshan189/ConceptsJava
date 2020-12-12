package com.sudarshan.conceptsjava.sockets;

import jdk.net.Sockets;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.logging.Logger;

public class SocketServerService {
    public static final int SERVER_PORT = 9000;
    public static void main(String[] args)  {

            try {
                ServerSocket socket = new ServerSocket(SERVER_PORT);
                while (true) {
                    SocketServerService.logger("Waiting for connections");
                    Socket socketConnection = socket.accept();
                    SocketServerService.logger("Found connection via := " + socketConnection.getInetAddress().toString());
                    OutputStream outputStream = socketConnection.getOutputStream();
                    String output = "Hello " + socketConnection.getInetAddress().toString() + " !!";
                    byte[] array = output.getBytes();
                    outputStream.write(array);
                    SocketServerService.logger(array.length + " bytes were sent");
                    socketConnection.close();
                    SocketServerService.logger("Closed connection with " + socketConnection.getInetAddress().toString());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    public static void logger(String message) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String datewithMessage = localDateTime.format(dateTimeFormatter);
        System.out.println(datewithMessage + " "+ message);
    }
}
