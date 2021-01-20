package com.viettel.networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Server using socket to send and receive message from server
 *
 * @author HuanNT
 */
public class Server {
    public final static int SERVER_PORT = 7;

    public static void main(String[] args) throws IOException, IOException {
        ServerSocket serverSocket = null;
        int number1 = 0;
        int number2 = 0;
        try {
            System.out.println("Binding to port " + SERVER_PORT + ", please wait  ...");
            //create new server socket
            serverSocket = new ServerSocket(SERVER_PORT);
            System.out.println("Server started: " + serverSocket);
            System.out.println("Waiting for a client ...");
            while (true) {
                try {
                    // server accept client's socket
                    Socket socket = serverSocket.accept();
                    System.out.println("Client accepted: " + socket);
                    OutputStream os = socket.getOutputStream();
                    InputStream is = socket.getInputStream();

                    // server receive 2 numbers from client
                    number1 = is.read();
                    number2 = is.read();
                    System.out.println(number1);
                    System.out.println(number2);
                    int z = number1 + number2;

                    // server send result to client
                    os.write(z);
                    System.out.println(z);
                    socket.close();
                } catch (IOException e) {
                    System.err.println(" Connection Error: " + e);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (serverSocket != null) {
                serverSocket.close();
            }
        }
    }
}
